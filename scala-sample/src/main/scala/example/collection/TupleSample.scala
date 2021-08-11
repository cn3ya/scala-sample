package example.collection


object TupleSample extends App {
  // create
  val t = (1, 3.14, "Fred")

  // select
  println(t._1)

  // modify

  // loop
  t.productIterator.foreach { i => println("Value = " + i) }
}
