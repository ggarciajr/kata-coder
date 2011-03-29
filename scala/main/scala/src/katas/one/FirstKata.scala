package katas.one

class FirstKata {
  def sum(upperLimit: Int, multiples: Seq[Int]): Int = upperLimit match {
    case 0 => 0
    case x =>
      if (isMultiple(x, multiples))
        (x + sum((x - 1), multiples))
      else
        sum((x - 1), multiples)
  }

  def isMultiple(upperLimit: Int, multiples: Seq[Int]): Boolean = {
    if (multiples.filter(upperLimit % _ == 0).isEmpty) false else true
  }
}