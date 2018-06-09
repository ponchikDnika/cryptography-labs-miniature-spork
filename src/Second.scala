import First.readInt

object Second {

  def testSecond(): Unit = {
    println("Введите число: ")
    val num = readInt
    println(num.toBinaryString)
    println("Введите количество бит: ")
    val nBits = readInt
    val highBits = getHighBits(num, nBits)
    val lowBits = getLowBits(num, nBits)
    println(s"High bits: $highBits : ${highBits.toBinaryString}\nLowBits: $lowBits : ${lowBits.toBinaryString}")
    val result = highBits << nBits | lowBits
    println(s"$result ${result.toBinaryString}")

    val middle = takeMiddle(num, nBits)
    println(s"Middle: $middle : ${middle.toBinaryString}")
  }

  def getLowBits(num: Int, nBits: Int): Int = num & ((1 << nBits) - 1)
  def getHighBits(num: Int, nBits: Int): Int = num >> (num.toBinaryString.length - nBits)
  def takeMiddle(num: Int, nBits: Int): Int = (num >> nBits) & ((1 << num.toBinaryString.length - 2 * nBits) - 1)
}
