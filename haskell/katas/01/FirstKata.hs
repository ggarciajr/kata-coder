module FirstKata (
  fkSum
) where

fkSum :: Int -> [Int] -> Int
fkSum a [] = 0
fkSum a (b) = foldl (+) 0 (filter (\x -> isMultiple x b) [1..a])

isMultiple :: Int -> [Int] -> Bool
isMultiple a [] = False
isMultiple a (x:xs) = if (mod a x == 0) then True else isMultiple a xs
