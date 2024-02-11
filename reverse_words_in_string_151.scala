object reverse_words_in_string_151 :
  def reverseWords(words: String): String = {
    words.trim.split(" +").reverse.mkString(" ")
  }

  def reverseWordsInPlace(words: String): Unit = {
    def reverseBetween(s: Array[Char], start: Int, end: Int): Unit = {
      var left = start + 1;
      var right = end - 1;
      while (left < right) {
        var temp = s(right);
        s(right) = s(left);
        s(left) = temp;
        left += 1;
        right -= 1;
      }
    }
    def reverseWordsChar(s: Array[Char]): Unit = {
      var left = -1;
      var right = 0;
      while (right <= s.length) {
        if (right == s.length || s(right) == ' ') {
          reverseBetween(s, left, right);
          left = right;
        }
        right += 1;
      }
      reverseBetween(s, -1, s.length);
    }
    
    var input: Array[Char] = (for (idx <- 0 to words.length) yield words(idx)).toArray
    reverseWordsChar(input)
    input.foreach(print)
  }
  def main(args: Array[String]) : Unit = {
    println(reverseWords("the sky  is blue"))
  }

