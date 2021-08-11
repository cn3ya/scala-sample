package example.collection

import scala.collection.mutable

object MapSample extends App {
  // create
  val colors = mutable.Map("red" -> "#FF0000", "azure" -> "#F0FFFF")

  // select
  println("red=" + colors.get("red"))
  println("blue=" + colors.get("blue"))
  println("keys:" + colors.keys)
  println("values:" + colors.values)

  // modify
  colors += ("blue" -> "#00FF00")
  println(colors)

  // loop
}
