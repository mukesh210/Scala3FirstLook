object NewTypes {



  /*
    1. Opaque Types
        Replace extending AnyVal
        a. Create a new type from an existing type without runtime cost
        b. At runtime cost, it will be considered as underlying type
           but at compile time, operation will be limited to overlying type.
           This way, we can be safe.
        c. Example: represent password as String - what could go wrong?
            See package "opaqueTypes"
        d. opaque type NewType = Type
        e. Define opaque types within a package or object
        f. Opaque types still have toString, hashCode and equals

    2. Intersection Types
        Replace A with B
        a. "A & B" means all values that are both A and B
        b. "A & B" equals "B & A"
        c.See OpenClose.scala
    3. Union Types
        No Scala 2 equivalent
        a. Useful with dynamically types languages like Javascript, if you're using Scarlet
        b. "A | B" means all values that are A or B
        c. "A | B" means "B | A"
        d. Use remains to be seen
  */
}
