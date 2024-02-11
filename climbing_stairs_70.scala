object climbing_stairs_70:
  def climbing_stairs(n:Int): Int = 
    if (n == 0) then return 0
    var (prev,curr) = (0,1)
    for (idx <- 1 to n) do
      curr = prev + curr
      prev = curr - prev
    curr

