require "test/unit"
require "../../katas/01/first_kata"

class FirstKataTest < Test::Unit::TestCase
  def test_sum
    assert_equal(23, FirstKata.new.sum(9, 3, 5), "result should be 23")
    assert_equal(233168, FirstKata.new.sum(999, 3, 5), "result should be 233168")
  end
end
