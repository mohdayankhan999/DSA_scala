object remove_duplicate_from_sorted_array_26 :
    def removeDuplicates(nums: Array[Int]): (Int,Array[Int]) =
      if nums.length == 0 then return (0,null)
      var unique_count = 1
      for (idx <- 1 until nums.length) do
        if nums(idx - 1) != nums(idx) then
          nums(unique_count) = nums(idx)
          unique_count += 1
      (unique_count, nums.take(unique_count))
