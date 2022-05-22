package password

opaque type Password = String
object Password:
  def apply(s: String): Password = s

extension (p: Password)
  def encrypt: String = p.reverse
