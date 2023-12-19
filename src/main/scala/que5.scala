object que5 {
  def main(args: Array[String]): Unit = {
    println("Enter a value in range of 0 to 100")
    val a = scala.io.StdIn.readInt()
    var b = a
    if (b>=0 && b<=100) {
      if(b>=90 && b<=100){
        println("Super Smart")
      }
      else if(b>=80 && b<=90){
        println("Smart")
      }
      else if (b >= 70 && b <= 80) {
        println("Smart Enough")
      }
      else if (b >= 60 && b <= 70) {
        println("Just Smart")
      }
      else if (b >= 35 && b <= 60) {
        println("Not Smart")
      }
      else if (b >= 0 && b <= 35) {
        println("Dump")
      }
    }
    else{
      println("Invalid Input")
    }

  }
}

