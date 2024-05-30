class Solution {
    fun isPalindrome(x: Int): Boolean {
    if (x<0) return false ;
    var firstNum = x ;

    var reversedNum = 0 ;
   
   while (firstNum != 0){
      var lastDigit = firstNum % 10 ;
      reversedNum = reversedNum * 10 + lastDigit
      firstNum /= 10
   }
    return x==reversedNum
    }}
//edited for github sync