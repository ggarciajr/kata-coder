package katas.two

import scala.math._

/**
 * Created by Eureka.
 * User: ggarcia
 * Date: 5/09/11
 * Time: 14:26
 *
 * @author ggarcia
 */
class SecondKata {
  def sum(limit: Long): Long = {
    val n: Long = round(((log(limit * sqrt(5))) * 2) + 1.618)

    var sum: Long = 0

    (for (i: Long <- 6l to 40l;
          j = (4 * fib(i - 3)) + fib(i - 6);
          if (j < limit) && isEven(j)
    ) yield j).foreach(sum += _)

    sum + 2
  }

  def isEven(n: Long): Boolean = {
    return (n % 2) == 0
  }

  def fib(n: Long): Long = {
    if ((n < 2)) n else fib(n - 1) + fib(n - 2)
  }
}