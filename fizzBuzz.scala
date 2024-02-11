object fizzBuzz {
    def fizzBuzzSol(num: Int) : Unit = {
      var res  = for (word <- 1 to num) yield {
        (word % 15 == 0, word % 5 == 0, word%3 == 0) match {
          case (true, true, true) => "FizzBuzz"
          case (false, true, false) => "Buzz"
          case (false, false, true) => "fizz"
          case _ => word.toString
        }
      }
      res.foreach(println)
    }
    def main(args: Array[String]): Unit = {
      fizzBuzzSol(15)
    }
  }

