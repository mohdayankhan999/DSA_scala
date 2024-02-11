import scala.annotation.tailrec
import scala.collection.mutable
object validParentheses20 {
  def isValid_normal(s: String): Boolean = {
    val matched = Map('(' -> ')', '[' -> ']', '{' -> '}')
    val stack = mutable.Stack[Char]()
    for (ch <- s) {
      if (matched.contains(ch)) {
        stack.push(ch)
      }
      else {
        if (stack.isEmpty) return false
        //if (!(matched.get(stack.pop) == ch)) return false
        if (!matched.get(stack.pop).contains(ch)) return false
        // !"}".contains("}") --> !true --> false

      }
    }
    
    stack.isEmpty
  }
//
//  def isValid(string: String): Boolean = {
//    @tailrec
//    def rec(rem: String, stack: List[Char]): Boolean = {
//      (stack.headOption, rem.headOption) match {
//        case (Some('{'), Some('}')) => rec(rem.tail, stack.tail)
//        case (Some('['), Some(']')) => rec(rem.tail, stack.tail)
//        case (Some('('), Some(')')) => rec(rem.tail, stack.tail)
//        case (_, Some(head)) => rec(rem.tail, head :: stack)
//        case (None, None) => true
//        case _ => false
//      }
//    }
//    rec(string, Nil)
def main(args: Array[String]): Unit = {
  isValid_normal("((())){}{}{{[[]]}}")

}

}
