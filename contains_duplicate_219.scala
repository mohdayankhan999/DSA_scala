object contains_duplicate_219 :
  def containsNearbyDuplicate(nums: Array[Int], k: Int): Boolean =
    var memo: Map[Int,Int] = Map.empty
    var (prevIdx,currIdx,dis) = (0,0,Int.MaxValue)
    while (currIdx  < nums.length && dis > k) do
      val ele = nums(currIdx)
      prevIdx = memo.getOrElse(ele,Int.MaxValue)
      memo += (ele -> currIdx)
      dis = Math.abs(prevIdx - currIdx)
      currIdx += 1
    dis <= k
  def main(args: Array[String]): Unit =
    println(containsNearbyDuplicate(Array(1,2,3,4,1),3))
