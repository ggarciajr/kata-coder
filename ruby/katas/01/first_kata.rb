class FirstKata
  def sum(upper_limit, multiples)
    sum = 0

    upper_limit.to_i.times do |i|
      sum += i if is_multiple?(i, multiples)
    end

    sum
  end

  def is_multiple?(number, multiples)
    multiple = false

    multiples.each do |j|
      if (number % j == 0)
        multiple = true
      end
    end

    multiple
  end
end