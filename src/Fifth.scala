import scala.math.log

object Fifth {

  def testFifth(): Unit = {
    println("Enter number: ")
    val number = First.readInt
    println(maxPowerOfTwo(number))
  }

  def maxPowerOfTwo(number: Int): Double = {
    var x = number
    x = x | (x >> 1)
    x = x | (x >> 2)
    x = x | (x >> 4)
    x = x | (x >> 8)
    x = x | (x >> 16)
    x = x - (x >> 1)
    (log(x) / log(2)).toInt
  }

}
