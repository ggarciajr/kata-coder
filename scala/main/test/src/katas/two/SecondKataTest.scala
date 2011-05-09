package katas.two

import org.scalatest.Assertions
import org.testng.annotations.Test
import org.testng.Assert._

/**
 * Created by Eureka.
 * User: ggarcia
 * Date: 5/09/11
 * Time: 14:22
 *
 * @author ggarcia
 */
class SecondKataTest extends Assertions {
  @Test
  def sum() {
    val kata = new SecondKata

    assertEquals(kata.sum(4000000), 4613732l, "4613732")
    assertEquals(kata.sum(50), 44, "44")
    assertEquals(kata.sum(150), 188, "188")
  }
}