import scala.annotation.tailrec
object decodeString394 {
  def decodeString(string: String): String = {
    def rec(startIdx: Int, res: String): String = {
      startIdx match {
        case terminate if terminate == string.length => res
        case newRec if string(startIdx) == '[' => {
          rec(startIdx + 1, res)
        }
        case numIdx if string(startIdx).isDigit => {
          val endIdx = string.indexOf("[", startIdx)
          val result = for (repeat <- 0 to string.slice(startIdx, endIdx).toInt) yield rec(endIdx, res)
          println(result)
          rec(endIdx + 1, result.mkString + res)
        }
        case stringIdx if string(stringIdx).isLetter => {
          val endIdx = string.indexOf("\\D", startIdx)
          val result = string.slice(stringIdx, endIdx)
          rec(endIdx + 1, res + result)
        }
        case _ => res
      }
    }
    rec(0, "")
  }


}
