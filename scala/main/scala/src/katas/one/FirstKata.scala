package katas.one

class FirstKata {
  def sum(upperLimit: Int): Int = {
    var sum: Int = 0;

    for (i <- 1 until upperLimit) {
      if (i % 3 == 0 || i % 5 == 0)
        sum = sum + i
    }

    sum
  }
}