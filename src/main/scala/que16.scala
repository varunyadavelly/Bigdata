object que16 {
  def main(args: Array[String]): Unit = {
    var ans=0
    for(i<- 382 to 582){
      if(i%2==0){
        ans=ans+i
      }
    }
    println(s"Sum of all even numbers between 382 to 582 = $ans")
  }
}
//Write a program to sum all even numbers between 382 and 582.