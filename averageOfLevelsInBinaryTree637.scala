object averageOfLevelsInBinaryTree637 {
  
   
   class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
   var value: Int = _value
   var left: TreeNode = _left
   var right: TreeNode = _right}
  
  def averageOfLevels(root: TreeNode): Array[Double] = {
    import scala.collection.mutable.ArrayBuffer
    def bfs(curLevel: List[TreeNode], ret: ArrayBuffer[Double]): Unit = {
      val nextLevel = (curLevel flatMap { n => List(n.left, n.right) }) filter (_ != null)
      if (nextLevel.isEmpty) return
        ret += nextLevel.map(_.value.toLong).sum.toDouble / nextLevel.length
      bfs(nextLevel, ret)
    }
    
    if (root == null) Array[Double]()
    else {
      val ret = ArrayBuffer[Double](root.value)
      bfs(List(root), ret)
      ret.toArray
    }
  }


}
