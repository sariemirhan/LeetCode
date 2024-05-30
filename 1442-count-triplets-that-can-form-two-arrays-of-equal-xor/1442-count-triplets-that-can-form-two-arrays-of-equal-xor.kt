class Solution {
    fun countTriplets(arr: IntArray): Int {
        val n = arr.size
        val preXor = IntArray(n + 1)

        for (i in 0 until n) {
            preXor[i + 1] = preXor[i] xor arr[i]
        }
        
        var count = 0
        
        
        for (i in 0 until n) {
            for (k in i + 1 until n) {
                if (preXor[i] == preXor[k + 1]) {count += (k - i)}
            }
        }
        return count
    }
}

fun main() {
    val solution = Solution()
    println(solution.countTriplets(intArrayOf(2, 3, 1, 6, 7)))  
    println(solution.countTriplets(intArrayOf(1, 1, 1, 1, 1)))  
}
//Idk why but i had a headache while coding this 