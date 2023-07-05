import scala.io.StdIn.readInt

object Q2 {
  def pattern(n: Int): Unit = n match {
    case x if x < 0 => println("Negative")
    case x if x == 0 => println("Zero")
    case x if x % 2 == 0 => println("Even")
    case x if x % 2 == 1 => println("Odd")
  }

  def main(args: Array[String]): Unit = {
    println("Enter integer input: ")
    val num = readInt()
    pattern(num)
  }

}
