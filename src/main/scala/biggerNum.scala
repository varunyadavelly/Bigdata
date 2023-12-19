object biggerNum {
  def main(args: Array[String]): Unit = {
    var a = 20
    var b = 20
    var c = 40
    if (a > b && a > c) {
      println(a)
    }
    else if (b > a && b > c) {
      println(b)
    }
    else {
      println(c)
    }
  }
}
