import scala.collection.mutable
object groupAnagrams49 {
  def groupAnagrams(strs: Array[String]): List[List[String]] = {
    var group : mutable.Map[String,List[String]] = mutable.Map.empty
    for (str <- strs) {
      val key = str.groupMapReduce(identity)(r=>1)(_+_).toList.sorted.mkString// only sorting 26 characters, constant
      if (group.contains(key)) {
        group(key) = group(key) ::: List(str)
      } else {
        group += (key-> List(str))
      }
    }
    

    group.values.toList
  }

  def main(args: Array[String]): Unit = {
    println(groupAnagrams(Array("eaat","aaet")))
  }

}
