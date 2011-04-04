class FirstKata
  def sum(upper_limit, first_multiple, second_multiple)
    first_sum = sum_multiples(upper_limit, first_multiple)
    second_sum = sum_multiples(upper_limit, second_multiple)
    third_sum = sum_multiples(upper_limit, first_multiple * second_multiple)

    first_sum + second_sum - third_sum
  end

  def sum_multiples(upper_limit, multiple)
    n = upper_limit / multiple

    j = (n * (n + 1) / 2) * multiple
  end
end