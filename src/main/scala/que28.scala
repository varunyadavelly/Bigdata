object que28 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 until 26) {
        if (i % 5 == 0) {
          print("divisible by five,")
        }
        else if(i%2!=0){
          print(s"$i,")
        }

      }
    }
}

//Write programs to print the following series. 1,3, divisible by five, 7,9,
//11,13, divisible by five,.....21,23, divisible by five