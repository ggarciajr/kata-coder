class SecondKata
  def sum(limit)
    sum = 0
	
    limit.to_i.times do |i|
	  fibN = fib(i)
	  
	  sum += fibN if fibN % 2 == 0
	  
	  break if fibN > limit
	end
	
	sum
  end
  
  def fib(n)
    n < 2 ? n : fib(n - 1) + fib(n - 2)
  end
end