object que4 {
  def main(args: Array[String]): Unit = {
    println("Enter a value in range of 100 to 1000")
    val a = scala.io.StdIn.readInt()
    var b =a
    if(b>100 && b<1000){
      println("Wrong Number")
    }
    else{
      if(b%2==0){
        println("Remainder", b%3)
      }
      else{
        println("Remainder", b%2)
      }
    }
  }
}
