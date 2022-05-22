object Sort:
  // explicitly importing only Ordering[Int]
  import scala.math.Ordering.{given Ordering[Int]}

  def sort[A](elements: List[A])(using ol: Ordering[A]): List[A] =
    def insert(elt: A, lst: List[A])(using ord: Ordering[A]): List[A] =
      lst match
        case Nil => elt :: Nil
        case a :: as =>
          val ordering = ord.compare(elt, a)
          if ordering < 0 then elt :: lst
          else if ordering > 0 then a :: insert(elt, as)
          else elt :: lst

    elements match
      case Nil => Nil
      case a :: as => insert(a, sort(as))

  @main def sortExample(): Unit =
    println(sort(List(1, 7, 8, 2, 5, 3, 10, 1)))
