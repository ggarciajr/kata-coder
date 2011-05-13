class SecondKata
  def sum(limit)
    sum = 0
	n = ((Math.log(limit.to_i * (Math.sqrt 5)) * 2) + 1.618).round
	
    (6..n).each do |i|
	  fibN = (4 * fib(i - 3)) + fib(i - 6)
	  
	  sum += fibN if fibN % 2 == 0
	  
	  break if fibN > limit
	end
	
	sum + 2
  end
  
  def fib(n)
    n < 2 ? n : fib(n - 1) + fib(n - 2)
  end
end