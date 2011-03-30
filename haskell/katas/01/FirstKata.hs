module FirstKata (
  fkSum
) where

fkSum :: Int -> Int
fkSum a = foldl (+) 0 (filter (\x -> (mod x 3 == 0) || (mod x 5 == 0)) [1..a])
