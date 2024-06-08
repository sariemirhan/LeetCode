class Solution {
    fun checkSubarraySum(nums: IntArray, k: Int): Boolean {
        val map = mutableMapOf<Int, Int>()
    map[0] = -1
    var sum = 0

    for (i in nums.indices) {
        sum += nums[i]
        val remain = sum % k

        if (map.containsKey(remain)) {
            if (i - map[remain]!! > 1) {
                return true
            }
        } else {
            map[remain] = i
        }
    }
    return false  
    }
}