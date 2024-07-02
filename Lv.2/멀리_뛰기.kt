class Solution {
    fun solution(n: Int): Long {
        var way = LongArray(2001)
        way[1] = 1
        way[2] = 2

        for (i in 3 until 2001) {
            way[i] = (way[i - 1] + way[i - 2]) % 1234567
        }

        return way[n]
    }
}
