object que27 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 until 25) {
      if (i % 3 == 0) {
        print("factor of three,")
      }
      else {
        print(s"$i,")
      }

    }
  }

}

//Write programs to print the following series. 1,2,factor of three,4,5,factor
//of three, 7,8,factor of three,..........22,23,factor of three.
