require "test/unit"
require "../../katas/01/first_kata"

class FirstKataTest < Test::Unit::TestCase
  def test_is_multiple?
    assert_equal(true, FirstKata.new.is_multiple?(2, [2]), "result should be true")
    assert_equal(true, FirstKata.new.is_multiple?(6, [3]), "result should be true")
    assert_equal(true, FirstKata.new.is_multiple?(6, [3, 2]), "result should be true")
    assert_equal(true, FirstKata.new.is_multiple?(15, [3, 5]), "result should be true")
  end

  def test_sum
    assert_equal(23, FirstKata.new.sum(10, [3, 5]), "result should be 23")
    assert_equal(233168, FirstKata.new.sum(1000, [3, 5]), "result should be 233168")
  end
end
