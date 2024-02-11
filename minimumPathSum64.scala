object minimumPathSum64 :
    def minPathSum_optimal(grid: Array[Array[Int]]): Int = 
      var memoPrev: Array[Int] = Array.fill(grid.head.length + 1)(Int.MaxValue)
      val memoCurr: Array[Int] = new Array(grid.head.length + 1)
      for (rowIdx <- 1 to grid.length) do
        for (colIdx <- 1 to grid(0).length) do
          memoCurr(colIdx) = (memoPrev(colIdx) min memoCurr(colIdx - 1)) + grid(rowIdx - 1)(colIdx - 1)
        val temp = memoPrev
        memoPrev = memoCurr
        memoCurr(0) = Int.MaxValue
      memoCurr.last
    def main(args: Array[String]): Unit = 
      print(minPathSum_optimal(Array(Array(1,3,1),Array(1,5,1),Array(4,2,1))))
      //OUTPUT 7


