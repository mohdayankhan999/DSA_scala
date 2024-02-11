import scala.annotation.tailrec
object bestTimeToBuyAndSellStock121 {
  def maxProfit(prices: Array[Int]): Int = {
    @tailrec
    def tailRec(idx: Int, currMinPrice: Int, maxProfit: Int): Int = {
      if (idx == prices.length) maxProfit
      else tailRec(idx + 1, prices(idx) min currMinPrice, maxProfit max (prices(idx) - currMinPrice))
    }
    tailRec(0, Int.MaxValue, 0)
  }
  def main(args: Array[String]): Unit = {
    print(maxProfit(Array(13,2,3,2,33,22,999,2,32,32,2,3)))
    // OUPUT 997
  }
}
