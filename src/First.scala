object First {

  def testFirst(): Unit = {
    println("Enter a number")

    val input = readInt

    val toBinary = getBinaryString(input)
    println(toBinary)

    println("Enter a kth bit")
    val kth = readInt
    val kthBit = kth & (1 << input - 1)
    println(s"Kth bit: $kthBit")

    val unset = input & ~(1 << kth)
    println(s"Unset ${getBinaryString(unset)}")
    val set = input | (1 << kth)
    println(s"Set ${getBinaryString(set)}")


    println("Enter position1:")
    val pos1 = readInt
    println("Enter position2:")
    val pos2 = readInt
    val swaped = swapBits(input, pos1, pos2, 2)
    println(s"Swaped ${getBinaryString(swaped)}")

    println("How much bit to zero? ")
    val m = readInt
    val last = input >> m << m
    println(s"To Zero ${getBinaryString(last)}")
  }

  def swapBits(x: Int, p1: Int, p2: Int, n: Int = 8): Int = {
    val set1 = (x >> p1) & ((1 << n) - 1)
    val set2 = (x >> p2) & ((1 << n) - 1)
    var xor = set1 ^ set2
    xor = (xor << p1) | (xor << p2)
    val result = x ^ xor
    result
  }

  def getBinaryString(i: Int): String = {
    val bs = i.toBinaryString
    val bs32 = if (bs.length == 32) bs else ("0" * (32 - bs.length)) + bs
    bs32
  }

  def readInt: Int = {
    try {
      scala.io.StdIn.readInt()
    } catch {
      case _: NumberFormatException => 0
    }
  }
}
