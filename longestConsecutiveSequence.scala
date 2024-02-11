object longestConsecutiveSequence {
  def longestConsecutive(nums: Array[Int]): Int = {
    val memo = nums.toSet
    var res = 0
    for (node <- nums) {
      var curr_size = 0
      if (!memo.contains(node - 1)) {
        var nodeInc = node
        while (memo.contains(nodeInc)) {
          curr_size += 1
          nodeInc += 1
        }
        res = res max curr_size
      }
    }

    res
  }
}


