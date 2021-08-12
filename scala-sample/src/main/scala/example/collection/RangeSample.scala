package example.collection

object RangeSample extends App {
  // create
  val t = BigDecimal("1") to BigDecimal("9") by BigDecimal("1")

  // select

  // modify

  // loop
  println(t)
  println("max:" + t.max)
  println("sum:" + t.reduce(_ + _))
  println("product:" + t.product)
  println("reduce:" + t.reduce(_ + 1 / _))
  println("reduce:" + t.fold(BigDecimal("0")) { (z, i) => z - i })
}
