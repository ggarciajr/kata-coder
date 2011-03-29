package katas.one

class FirstKata {
  def sum(upperLimit: Int, multiples: Seq[Int]): Int = {
    var sum: Int = 0;

    for (i <- 1 until upperLimit) {
      if (isMultiple(i, multiples))
        sum = sum + i
    }

    sum
  }

  def isMultiple(upperLimit: Int, multiples: Seq[Int]): Boolean = {
    for (multiple <- multiples) {
      if (upperLimit % multiple == 0)
        return true
    }

    return false
  }
}