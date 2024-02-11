object valid_palindrome_215 :
  //private val validChar = (for (ord <- Range(65,91) ++ Range(97,123) ++ Range(48,58)) yield ord.toChar)
  def isPalindrome(string: String) : Boolean =
    var (left,right) = (0,string.length-1)
    while left < right do
      val (left_val,right_val) = (string(left),string(right))
      if !left_val.isLetterOrDigit  then
        left += 1
      else if  !right_val.isLetterOrDigit then
        right -= 1
      else if left_val.toLower == right_val.toLower then
        left += 1
        right -= 1
      else
        return false
    true

