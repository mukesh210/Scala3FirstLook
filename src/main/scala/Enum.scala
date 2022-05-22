import Enum.Delivery.{Express, Standard}

object Enum extends App :
  enum Delivery:

    def cost: Double =
      this match {
        case Standard => 3.99
        case Express(false) => 7.99
        case Express(true) => 10.99
      }

    case Standard
    case Express(tracked: Boolean)

  val standard = Delivery.Standard
  val express = Delivery.Express(false)

  println(s"standard delivery cost: ${standard.cost}")
  println(s"express delivery cost: ${express.cost}")

  enum IntList:
    def sum: Int =
      this match
        case Pair(h, t) => h + t.sum
        case End => 0

    case Pair(head: Int, tail: IntList)
    case End

  val intList = IntList.Pair(1, IntList.Pair(2, IntList.Pair(3, IntList.End)))
  println(s"intList sum: ${intList.sum}")

  enum MyList[A]:
    def length: Int =
      this match
        case Pair(h, t) => 1 + t.length
        case End() => 0

    case Pair(head: A, tail: MyList[A])
    case End[A]() extends MyList[A]

  val strList = MyList.Pair("a", MyList.Pair("b", MyList.Pair("c", MyList.End())))
  println(s"strList length: ${strList.length}")
  /*
    1. Enum is replacement for sealed trait and case classes
    2. Enumeration is data type with a predefined number of cases
    3. In Scala 3, to create instance, we need to use enum with "EnumerationName.CaseName"
    4. Cases with in Enumeration can have fields
    5. enum is used to create enumerations
    6. Think of enum as logical or
    7. Syntax:
        enum EnumerationName:
          case CaseOne(fields ...)
          case CaseTwo(fields ...)

    8. Also known as Algebraic data type
    9. Define methods on an enum within the enum scope
    10.Pattern match on cases within an enum
    11.Declare methods on enum without pattern matching
    12.Create recursive data and declare type variables on enum
  */