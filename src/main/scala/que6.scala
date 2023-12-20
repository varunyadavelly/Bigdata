object que6 {
  def main(args: Array[String]): Unit = {
    print("Enter the first number: ")
    val first = scala.io.StdIn.readDouble()

    print("Enter the second number: ")
    val sec = scala.io.StdIn.readDouble()

    print("Enter the operator (+, -, *, /): ")
    val op = scala.io.StdIn.readLine()

    val ans = op match {
      case "+" => first + sec
      case "-" => first - sec
      case "*" => first * sec
      case "/" => if (sec != 0) first / sec else "Cannot divide by zero"
      case _ => "Invalid operator"
    }

    println(s"Final Result: $ans")

  }
}
//Write a program to perform simple math based on the user inputs by using Switch condition.(+ , - , * , /)
