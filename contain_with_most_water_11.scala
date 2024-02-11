object contain_with_most_water_11 :
  def maxArea(height: Array[Int]) : Int =
    var (left,right, mx_area) = (0,height.length - 1,0)
    while left < right do
      //mx_area = (height(left).min(height(right)) * (right - left)).max(mx_area)
      //val (left_val,right_val) = (height(left),height(right))
      if height(left) < height(right) then
        mx_area = (height(left) * (right-left)).max(mx_area)
        left += 1
      else
        mx_area = (height(right) * (right-left)).max(mx_area)
        right -= 1
    mx_area

  def maxArea_readable(heights: Array[Int]): Int = {
    var (left, right, maxArea) = (0, heights.length - 1, 0)
    while left < right do
      val width = right - left
      val (leftHeight, rightHeight) = (heights(left), heights(right))
      val currentArea = {
        if leftHeight < rightHeight then
          left += 1
          leftHeight * width
        else
          right -= 1
          rightHeight * width
      }
      maxArea = maxArea.max(currentArea)
    maxArea
  }
