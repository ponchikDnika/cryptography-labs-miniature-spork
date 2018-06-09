import First.{readInt, swapBits, getBinaryString}

object Third {

  def testThird(): Unit = {
    println("Enter number: ")
    val number = readInt
    println(s"Number is: $number : ${getBinaryString(number)}")
    println("Enter position 1 and position 2")
    val pos1 = readInt
    val pos2 = readInt
    println(s"First position: $pos1 \n Second position: $pos2")
    val result = swapBytes(number, pos1, pos2)
    println(s"Result: $result : ${getBinaryString(result)}")
  }

  def swapBytes(number: Int, pos1: Int, pos2: Int): Int = {
    def bytePosition(position: Int): Int = position match {
      case 1 => 0
      case 2 => 8
      case 3 => 16
      case 4 => 24
      case _ => throw new IllegalArgumentException
    }
    swapBits(number, bytePosition(pos1), bytePosition(pos2))
  }
}
