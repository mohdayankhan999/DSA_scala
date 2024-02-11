object powerx_n_50 {

  def myPow(x: Double, n: Int): Double = {
    var res = 1.0
    var base = x
    var exp = n.toLong.abs
    while (exp > 0) do
      if (exp % 2 == 1) then
        res *= base
        exp -= 1
      else
        base *= base
        exp /= 2
        
    if n < 0 then 1.0 / res else res
  }
}
