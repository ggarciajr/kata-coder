class FirstKata
  def sum()
    sum = 0

    1000.to_i.times {
        |i| sum += i if (i % 3 == 0 || i % 5 == 0)
    }

    sum
  end
end