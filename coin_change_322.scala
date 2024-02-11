object coin_change_322 {
  def coinChange(coins: Array[Int], amount: Int): Int = {
    val memo: Array[Int] = Array.fill(amount + 1)(amount + 1)
    memo(0) = 0
    for (curr_amount <- 1 to amount) do
      for (coin <- coins) do
        if coin <= curr_amount then
          memo(curr_amount) = memo(curr_amount) min (memo(curr_amount - coin) + 1)
    if memo.last == amount+1 then -1 else memo.last
  }
  def main(args: Array[String]): Unit = {
    println("")
    print(coinChange(Array(2,3,5),100))
  }
}



