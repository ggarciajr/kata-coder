package katas.two

/**
 * Created by Eureka.
 * User: ggarcia
 * Date: 5/09/11
 * Time: 14:26
 *
 * @author ggarcia
 */
class SecondKata {
  var sum:Long = 0;

  def sum(limit: Long): Long = {
    var sum: Long = 0

    (for (i: Long <- 0l to 40l; j = fib(i); if (j < limit) && isEven(j)) yield j).foreach(sum += _)

    sum
  }

  def isEven(n: Long): Boolean = {
    return (n % 2) == 0
  }

  def fib(n: Long): Long = {
    if ((n < 2)) n else fib(n - 1) + fib(n - 2)
  }
}