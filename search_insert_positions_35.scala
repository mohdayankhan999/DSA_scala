import scala.annotation.tailrec

object search_insert_positions_35 {
  def searchInsert(nums: Array[Int], target: Int): Int = {
    @tailrec
    def binarySearch(start: Int, end: Int): Int = {
      if (start > end) return start
      val mid = (end - start) / 2 + start
      nums(mid) match {
        case ele if ele == target => mid
        case ele if ele > target  => binarySearch(start,mid-1)
        case ele if ele < target  =>  binarySearch(mid+1,end)
      }
    }
    binarySearch(0,nums.length-1)
  }
}
