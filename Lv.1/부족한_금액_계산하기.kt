class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var sum: Long = 0
        for (i in 0 until count) {
            sum += price * (i + 1)
        }
        if(money-sum>=0) return 0
        return Math.abs(money - sum)
    }
}
