class Solution {
    fun solution(num: Int): Int {
        var input = num.toLong()
        var cnt = 0

        while (input != 1.toLong()) {
            if (input % 2 == 0.toLong()) {
                input /= 2
            } else {
                input = input * 3 + 1
            }
            cnt++
            if (cnt == 500) return -1
        }
        return cnt
    }
}
