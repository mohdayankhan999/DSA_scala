object wordMatch {
  def gcd(num1: Int,num2: Int): Int = {
    if (num2 == 0) {
      num1
    } else {
      gcd(num2, num1 % num2)
    }
  }
  
  def sol(): Unit = {
    var source = "acbcdd"
    var target = "acbcdd"

    var freq = Array.fill(26)(0)
    for (ch <- source) {
      freq(ch - 'a') += 1
    }
  }

}
