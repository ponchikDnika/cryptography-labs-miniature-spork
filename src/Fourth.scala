object Fourth {

  def testFourth(): Unit = {
    println("Enter number: ")
    val number = First.readInt
    println(maxPowerOfTwo(number))
  }

  def maxPowerOfTwo(number: Int): Int = {
    number & -number
  }
}
