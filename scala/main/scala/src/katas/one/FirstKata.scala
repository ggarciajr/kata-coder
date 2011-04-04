package katas.one

class FirstKata {
  def sum(upperLimit: Long, firstMultiple: Int, secondMultiple: Int): Long = {
    return (sumMultiples(upperLimit, firstMultiple)
      + sumMultiples(upperLimit, secondMultiple)
      - sumMultiples(upperLimit, firstMultiple * secondMultiple))
  }

  def sumMultiples(upperLimit: Long, multiple: Int): Long = {
    val n: Long = upperLimit / multiple
    return (n * (n + 1) / 2) * multiple
  }
}