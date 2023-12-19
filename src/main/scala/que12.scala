object que12 {
  def main(args: Array[String]): Unit = {
    println("Enter range start")
    val first = scala.io.StdIn.readInt()

    println("Enter range end")
    val end = scala.io.StdIn.readInt()
    var i=0
    if(first<end) {
      for (j <- first to end) {
        if (j % 2 == 0) {
          i += 1
        }
      }
      println(i)
    }
  }
}
// Write a Program to print the count of the even numbers between the given range?