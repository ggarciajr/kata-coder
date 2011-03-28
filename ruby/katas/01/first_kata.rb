class FirstKata
  def sum(upper_limit, multiple)
    sum = 0

    upper_limit.to_i.times do |i|
      sum += i if (i % multiple == 0)
    end

    sum
  end
end