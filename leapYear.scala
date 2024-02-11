object leapYear {
  def leapYear(year: Int): Boolean = {
    if year % 400 == 0  then
      true
    else if year % 4 == 0 && year % 100 != 0 then
      true
    else
      false
  }

  def main(args: Array[String]): Unit = {
  }
}

