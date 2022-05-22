trait Openable:
  def open: Unit

trait Closeable:
  def close: Unit

def openAndClose(oc: Openable & Closeable): Unit =
  oc.open
  oc.close

object OpenCloseExample extends Openable, Closeable:
  def open: Unit =
    println("Open")

  def close: Unit =
    println("Close!")

@main def openCloseEx() =
  openAndClose(OpenCloseExample)
