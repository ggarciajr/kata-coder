package katas.one

class FirstKata {
  def sum(upperLimit: Int, multiples: Seq[Int]): Int = {
    List.range(1, upperLimit).filter(isMultiple(_, multiples)).foldLeft(0)(_ + _)
  }

  def isMultiple(upperLimit: Int, multiples: Seq[Int]): Boolean = {
    if (multiples.filter(upperLimit % _ == 0).isEmpty) false else true
  }
}