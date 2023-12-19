object que29 {
  def main(args: Array[String]): Unit = {
    val i=0.5
    var start=i
    while(start<=5.1){
      var square=start*start
      print(s"$square,")
      start=start+0.2
    }
  }
}

//Write programs to print the following series. 0.5^2, 0.7^2,0.9^2....5.1^2
