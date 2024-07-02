class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var cnt = 0
        lost.sort()
        reserve.sort()

        val lostList = lost.toMutableList()
        val reserveList = reserve.toMutableList()
        val removedList = mutableListOf<Int>()

        lostList.forEach {
            if (reserveList.contains(it)) removedList.add(it)
        }

        lostList.removeAll(removedList)
        reserveList.removeAll(removedList)

        for (i in lostList.indices) {
            for (j in reserveList.indices) {
                if (reserveList[j] == lostList[i] + 1 || reserveList[j] == lostList[i] - 1) {
                    reserveList.removeAt(j)
                    cnt++
                    break;
                }
            }
        }
        return n - lostList.size + cnt
    }
}
