class Solution {
    fun solution(n: Int): Int {
        var toTinary = ""
        var input = n

        while (input > 0) {
            toTinary += input % 3
            input /= 3
        }

        var toTinaryLong = toTinary.toLong()
        var toDecimal = 0
        var answer : Int= 0
        var i = 0.0

        while (toTinaryLong > 0) {
            toDecimal = (toTinaryLong % 10).toInt()
            answer += Math.pow(3.0, i).toInt() * toDecimal
            toTinaryLong /= 10
            i++
        }
        return answer
    }
}
