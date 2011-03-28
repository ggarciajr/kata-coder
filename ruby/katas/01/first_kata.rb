class FirstKata
  def sum(upper_limit, multiples)
    sum = 0

    upper_limit.to_i.times do |i|
      sum += i if is_multiple?(i, multiples)
    end

    sum
  end

  def is_multiple?(number, multiples)
    multiples.each do |j|
      return true if (number % j == 0)
    end

    false
  end
end