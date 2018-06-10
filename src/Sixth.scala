import Fourth.maxPowerOfTwo

object Sixth {

  def testSixth(): Unit = {
    println("Enter number: ")
    val number = First.readInt
    println(xorAllBits(number))
  }

  def xorAllBits(num: Int): Int = {
    var value: Int = 369
    var result: Int = 0
    while (value != 0) {
      result ^= value & 1
      value >>= 1
    }
    result
  }
  
  /*public static int XorAllBits(uint value)
  {
    var result = 0;
    while (value != 0)
    {
      result ^= (int)value & 1;
      value >>= 1;
    }
    return result;
  }*/
  
}
