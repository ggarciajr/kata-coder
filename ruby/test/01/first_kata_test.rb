require "test/unit"
require "../../katas/01/first_kata"

class FirstKataTest < Test::Unit::TestCase
  def test_sum
    assert_equal(18, FirstKata.new.sum(10, 3), "result should be 18")
  end
end
