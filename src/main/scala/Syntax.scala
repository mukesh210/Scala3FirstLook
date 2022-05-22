object Syntax extends App:
  val theAnswer = 42

  def square(x: Double): Double =
    val result = x * x
    result
  end square

  println(square(theAnswer))

  val if_1 = if 0 < 25 then "small" else "big"

  val if_2 =
    if 23 > 15 then
      "big"
    else
      "small"

  println(s"if_1: ${if_1}")
  println(s"if_2: ${if_2}")

  val for_1 =
    for x <- List(1, 2, 3)
    yield x * x

  println(s"for_1: ${for_1}")
  /*
    1. Scala 3 supports Indentation based syntax
    2. Class, Trait and object -> use colon to indicate where the body starts
    3. Optionally, End blocks
    4. No Parentheses() around the condition of if
    5. "then" separates condition from true arm
    6. for comprehension: No braces or parentheses around generators like for
    7. "A extens B, C" instead of "A extends B With C"
    8. Use ? instead of _ as the wildcard argument in a type
    9. Automatic rewrites available for upgrade:
        -rewrite -new -style
        -rewrite -indent
  */
