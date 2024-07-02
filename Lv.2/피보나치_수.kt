class Solution {
    fun solution(n: Int): Int {
        val fibonacci = mutableListOf<Int>()
        fibonacci.add(0)
        fibonacci.add(1)

        for (i in 2..100000) {
            fibonacci.add((fibonacci[i - 1] + fibonacci[i - 2])%1234567)
            if (i == n) return fibonacci[i]
        }
        return 0
    }
}
