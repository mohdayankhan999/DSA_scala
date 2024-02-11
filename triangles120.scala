object triangles120 {
  def sol(): Unit = {
    var memo = Array.fill(10)(10)
    var memoCopy = List(1,2,3,4)
    var memoCopy2 = List(5,6)
    println(memoCopy.zip(memoCopy2))

  }

  def main(args: Array[String]): Unit = {
    sol()
  }
}
