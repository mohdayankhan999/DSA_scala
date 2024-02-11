object merge_sorted_array_88 {
  def merge(leftArray: Array[Int], m: Int, rightArray: Array[Int], n: Int ): Unit = {
    // to merge right array into left array
    // size of nums1 is n+m
    // constant space, O(n) time complexity
    var (leftIdx,rightIdx,mergedIdx) = (m-1,n-1,n+m-1)
    while rightIdx >= 0 || leftIdx >= 0 do
      if leftIdx == -1 || (rightIdx >= 0 && leftArray(leftIdx) <= rightArray(rightIdx)) then
        leftArray(mergedIdx) = rightArray(rightIdx)
        rightIdx -= 1
        mergedIdx -= 1
      else
        leftArray(mergedIdx) = leftArray(leftIdx)
        leftIdx -= 1
        mergedIdx -= 1
  }
  def main(args: Array[String]): Unit = {
    merge(Array(1, 2, 3, 4, 0, 0, 0), 4, Array(2, 4, 4), 3)
  }
}

