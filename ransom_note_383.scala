import scala.collection.mutable
object ransom_note_383 :
  def canConstruct_map(ransomNote: String, magazine: String): Boolean =
    //ransomNote.diff(magazine).isEmpty

    var freq : mutable.Map[Char, Int] = mutable.Map.empty
    var res = true
    //println(magazine.toList)
    magazine.foreach(ch => (freq = freq + (ch -> (freq.getOrElse(ch,0) + 1)) ))
    ransomNote.foreach(ch => {
      freq =  freq + (ch -> (freq.getOrElse(ch,0) - 1)) ; if freq.getOrElse(ch,-1) < 0 then (res = false)
    })
    res
  def canConstruct(ransomNote: String, magazine: String): Boolean =
    //ransomNote.diff(magazine).isEmpty
    val freq = new Array[Int](27)
    //println(magazine.toList)
    magazine.foreach(ch => freq(ch.toLower - 'a') += 1)
    ransomNote.foreach(ch => {freq(ch.toLower - 'a') -= 1 ; if freq(ch.toLower-'a') < 0 then return false})
    true




