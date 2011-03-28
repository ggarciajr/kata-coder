require "test/unit"
require "../../katas/01/first_kata"

class FirstKataTest < Test::Unit::TestCase
  def test_sim
    assert_equal(233168, FirstKata.new.sum, "result should be 233168")
  end
end
