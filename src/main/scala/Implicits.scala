object Implicits extends App :
  def min[A](x: A, y: A)(using ord: Ordering[A]): A =
    if ord.compare(x, y) < 0 then x else y

  object Given_Asc {
    given aGivenOrdering: Ordering[Int] =
      new Ordering[Int]:
        override def compare(x: Int, y: Int): Int =
          if x < y then -1
          else
            if x == y then 0
            else 1
  }

  object Given_Desc {
    given aGivenOrdering: Ordering[Int] with
      override def compare(x: Int, y: Int): Int =
        if x > y then -1
        else
          if x == y then 0
          else 1
  }

  object Given_3 {
    given Ordering[Int] with
      override def compare(x: Int, y: Int): Int = -1
  }

  // import Given_Asc.given
  // import Given_Desc.given
  import Given_3.given

  println(min(42, 0)) // (using Ordering.Int)

  /*
    1. "using" clause replaces Scala 2 implicit parameters
    2. "given" clause replaces Scala 2 implicit value
    3. Parameters list on a method or class constructor that starts with the keyword
       "using", we can explicitly provide arguments with "using"
    4. Given Alias:
        given name: Type = expression
    5. Given Instances implementing a Trait:
        given name: Type with
          body
    6. If no given is provided, it is automatically supplied by the compiler
        to "using" clauses e.g. Ordering[Int]
    7. Implicit Scope Details:
      a. where the compiler looks for given instances
      b. Includes companion objects
      c. "using" clause in the lexical scope
      d. Explicitly import given instances to put them in the implicit scope
          for e.g. "import package.given"
    8.  Context Bounds:
        Normally we have
          def min(x: A, y: A)(using ord: Ordering[A]): A
        with context bounds, it become:
          def min[A: Ordering](x: A, y: A): A

        With context bounds, ordering can't be accessed explicitly in method
  */
