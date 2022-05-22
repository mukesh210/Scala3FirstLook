type Password = String
type User = String
type Session = String

trait AuthService:
  def auth(name: String, password: Password): Option[User]

trait SessionService:
  def create(user: User): Option[Session]

class UserService(auth: AuthService, session: SessionService) extends AuthService with SessionService:
  // I don't have to write this now for Scala 3
//  override def auth(name: String, password: Password): Option[User] =
//    auth.auth(name, password)
//
//  override def create(user: User): Option[Session] =
//    session.create(user)
  export auth.*
  export session.*

object auth extends AuthService:
  override def auth(name: _root_.java.lang.String, password: Password): Option[User] =
    if name == "Noel" && password == "top" then Some("Noel")
    else None

object Session extends SessionService:
  override def create(user: User): Option[Session] =
    if user == "noel" then Some("session")
    else None

@main def exportExample(): Unit =
  val userService = UserService(auth, Session)
  val user = userService.auth("Noel", "top")
  println(user)
  println(user.map(userService.create))