package katas.one

import org.scalatest.Assertions
import org.testng.annotations.Test
import org.testng.Assert._

class FirstKataTest extends Assertions {
  @Test
  def sum() {
    val kata = new FirstKata

    assertEquals(kata sum 10, 23, "result should be 23")
    assertEquals(kata sum 1000, 233168, "result should be 233168")
  }
}