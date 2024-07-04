class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        val map = mutableMapOf<Int, Int>()
        var n = k
        var cnt = 0

        for (key in tangerine) {
            map[key] = map.getOrDefault(key, 0) + 1
        }

        val sortedMap = map.toList().sortedByDescending { it.second }.toMap().toMutableMap()

        for (key in sortedMap) {
            n -= key.value
            cnt++
            if (n <= 0) break   
        }
        return cnt
    }
}
