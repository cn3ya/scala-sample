package example

object StringSample extends App {

  val name = "Bob"
  val someString = s"Hello, $name!" // this is much better that: "Hello" + name + "!"
  println(someString)

}
