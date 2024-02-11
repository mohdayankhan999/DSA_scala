object valid_anagram_242 :
  def isAnagram(firstWord: String, secondWord: String): Boolean = {
    //return firstWord.diff(secondWord).isEmpty && secondWord.diff(firstWord).isEmpty
    var freq = Map[Char,Int]().withDefaultValue(0)
    firstWord.foreach(r => freq += (r -> (freq(r)+1)))  // add frequency
    secondWord.foreach(r => freq += (r -> (freq(r)-1))) // remove frequency
    freq.values.forall(_==0)
  }
  

  def main(args: Array[String]): Unit = {
    println("abs".diff("abs").isEmpty)
    println(isAnagram("ayan","aaynn"))
  }

