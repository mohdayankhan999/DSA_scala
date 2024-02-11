object wordBreak139 {

  def wordBreak(string: String, wordDict: List[String]) : Boolean = {
    val dictionary: Set[String] = Set().empty
    val memo: Array[Boolean] = Array.fill(string.length + 1)(false)
    memo(0)=true
    for (word <- wordDict) dictionary + word
    for (endIdx <- string.indices ) {
      var startIdx = endIdx
      while (startIdx >= 0 && !memo(endIdx + 1)) {
        if ((dictionary contains string.substring(startIdx,endIdx + 1)) && memo(startIdx)) {
          memo(endIdx + 1) = true
        }
        startIdx -= 1
      }
    }
    memo.last
  }

}
