class Solution {
    fun singleNumber(nums: IntArray): IntArray {
        var xorResult = 0
        for(num in nums){ 
            xorResult = xorResult xor num
        }
            val difBit = xorResult and -xorResult
        var num1 = 0
        var num2 = 0
        for(num in nums){
            if((num and difBit)!=0){
                num1= num1 xor num
            }else{
                num2 = num2 xor num
            }
        }
        return intArrayOf(num1,num2)
    }
    fun test(){
        
        val nums = intArrayOf(1,2,1,3,2,5)
        
        val result = singleNumber(nums)

        println(result.joinToString(", "))
}
}