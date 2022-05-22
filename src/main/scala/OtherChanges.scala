object OtherChanges extends App:


  /*
    1. Top level declarations:
         a. Val, type, def can be used at the top level
         b. Replaces package objects

    2. Main declaration:
        a. Annotate a method with "@main"
        b. Must be a top-level method or in a statically accessible object
        c. If main method accepts some parameter, then parameters are
            converted using "FromString" in "CommandLineParser"

    3.  Export Declarations:
        a. Useful for programming with composition over inheritance
        b. Import clauses change how we refer to names defined outside our code
        c. Export clauses change how outside code refers to names defined in our code(See UserService.scala)

    4. Worksheets
        a. New mode that evaluates code whenever the file is saved
        b. Fantastic for exploratory programming
        c. Uses extension .worksheet or .sc
  */