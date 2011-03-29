package katas.one

class FirstKata {
  def sum(upperLimit: Int, multiples: Seq[Int]): Int = {
    var sum: Int = 0;

    for (i <- 1 until upperLimit if isMultiple(i, multiples))
    yield sum = sum + i

    sum
  }

  def isMultiple(upperLimit: Int, multiples: Seq[Int]): Boolean = {
    if (multiples.filter(upperLimit % _ == 0).isEmpty) false else true
  }
}