package katas.one

import org.scalatest.Assertions
import org.testng.annotations.Test
import org.testng.Assert._

class FirstKataTest extends Assertions {
  @Test
  def sum() {
    val kata = new FirstKata

    assertEquals(kata.sum(9, 3, 5), 23, "result should be 23")
    assertEquals(kata.sum(999, 3, 5), 233168, "result should be 233168")
    assertEquals(kata.sum(9, 2, 4), 24, "result should be 24")
  }
}