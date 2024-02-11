object maximum_depth_of_binary_tree_104 :
  
  class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null):
    var value: Int = _value
    var left: TreeNode = _left
    var right: TreeNode = _right

  def maxDepth(root: TreeNode): Int =
    def recWithAcc(node: TreeNode, height: Int = 0): Int =
      if node == null then height else recWithAcc(node.left,height+1) max recWithAcc(node.right,height+1)
    recWithAcc(root,0)
  
  def main(args: Array[String]): Unit =
    val leafElement1 = TreeNode(9)
    val leafElement2 = TreeNode(15)
    val leafElement3 = TreeNode(7)
    val parentElement2 = TreeNode(20,leafElement2,leafElement3)
    val root = TreeNode(3,leafElement1,parentElement2)

    //                 3
    //          9            20
    //                   9        15

    print(maxDepth(root))

    //OUTPUT 3


