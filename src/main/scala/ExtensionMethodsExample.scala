object ExtensionMethodsExample extends App:
  println("Noel".palindromic)
  println("Anna".palindromic)
  println(3.isOdd)
  println(2.isEven)
  "cat".debug
  4.debug

extension (s: String)
  def palindromic: Boolean =
    s.toLowerCase.reverse == s.toLowerCase

extension (int: Int)
  def isOdd: Boolean =
    int % 2 == 1

  def isEven: Boolean =
    int % 2 == 0

extension [A](a: A)
  def debug: Unit =
    println(s"DEBUG: ${a}")


/*
  Extension methods allow us to add methods to classes that have been defined somewhere else
  Extension methods replace implicit methods from Scala 2
  We can define multiple methods in an extension block

  Importing Extension method Steps:
    1. Import by name if needed(See ImportingExtensionsByName.scala)
    2. Wildcards imports will import extension methods
    3. Extensions can be defined by generic Types
    4. Can also use context bounds, using clauses, and so on, to limit generic types
*/
