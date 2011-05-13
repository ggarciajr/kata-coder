require "test/unit"
require "../../katas/02/second_kata"

class SecondKataTest < Test::Unit::TestCase
  def test_sum
    assert_equal(4613732, SecondKata.new.sum(4000000), "result should be 4613732")
	
    assert_equal(44, SecondKata.new.sum(50), "result should be 44")
    
	assert_equal(188, SecondKata.new.sum(150), "result should be 188")
  end
end
