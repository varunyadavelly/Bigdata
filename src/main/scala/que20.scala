object que20 {
  def main(args: Array[String]): Unit = {
    var i=1
    while(i<101){
      if(i%2==0){
        print("B, ")
      }
      else{
        print("A, ")
      }
      i+=1
    }

  }
}
//Write a program to print A, B alternatively for 100 times. Ex: (A, B, A, B, A,B...)