import Test.HUnit
import FirstKata 

testFkSumFirst = TestCase $ assertEqual "result should be 23" 23 (fkSum 9 3 5)
testFkSumSecond = TestCase $ assertEqual "result should be 233168" 233168 (fkSum 999 3 5)

suite = TestList [ testFkSumFirst, testFkSumSecond ]
