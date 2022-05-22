package email

object Email:
  def sendEmail(address: String, userName: String): Unit =
    println(s"Sending email to $address, Hi $userName")

  import password.*
  val p = Password("erertertrr")

  // This doesn't compile
  // sendEmail("abc@gmail.com", p)

  /*
    Since Password is opaque Type,
      it means at runtime, it won't have any additional cost because
      it will be treated as String
      but at compile time, it will be considered as Password

      Due to this, if someone accidently sends Password(which is String in core),
      then we will get compilation error.
      This way, we can ensure type safety.
  */
