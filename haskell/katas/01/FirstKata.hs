module FirstKata (
  fkSum
) where

fkSum u x y = f x + f y - f (x * y)
 where f d = let n = u `div` d in (n * (n + 1) `div` 2) * d