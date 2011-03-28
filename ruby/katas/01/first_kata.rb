class FirstKata
  def sum(upper_limit)
    sum = 0

    upper_limit.to_i.times {
        |i| sum += i if (i % 3 == 0 || i % 5 == 0)
    }

    sum
  end
end