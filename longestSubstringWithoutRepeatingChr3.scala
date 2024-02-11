object longestSubstringWithoutRepeatingChr3 {

  def lengthOfLongestSubstring(string: String): Int = {
    var memo: Map[Char, Int] = Map.empty
    var start, maxlength = 0
    for (idx <- string.indices) {
      if (memo contains string(idx)) {
        start = (memo(string(idx)) + 1) max start
      }
      memo += (string(idx) -> idx)
      maxlength = (idx - start + 1) max maxlength
    }
    maxlength
  }

  def main(args: Array[String]): Unit = {
    print(lengthOfLongestSubstring("abcabacbaksdjf"))
  }

}
