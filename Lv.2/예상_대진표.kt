class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var cnt = 0
        var inputA = a
        var inputB = b

        while (true) {
            inputA = inputA / 2 + inputA % 2
            inputB = inputB / 2 + inputB % 2
            cnt++
            if (inputA == inputB) return cnt
        }
    }
}
