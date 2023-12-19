object que18 {
  def main(args: Array[String]): Unit = {
    var inc=0
    var sum=0
    for(i<- 24 to 100){
      if(i%2==0){
        sum= sum+i
        inc+=1
      }
    }
    val avg= sum/inc
    println(s"Avg of even numbers bw 24 to 100= $avg")
  }
}
// Write a program to find the average of 24,26,28,.....100.