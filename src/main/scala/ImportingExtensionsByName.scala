package ex1:
  extension (i: Int)
    def times(f: Int => Unit): Unit =
      if i < 0 then ()
      else (0.to(i)).foreach(f)

package ex2:
  import ex1.times

  val _ = 5.times(_ => println("Hi!"))