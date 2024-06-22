class Solution {
    fun solution(s: String): Int {
        val nums = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
        var input = s
        for (i in nums.indices) {
            input = input.replace(nums[i], i.toString())
        }
        return input.toInt()
    }
}
