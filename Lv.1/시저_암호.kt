class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""

        for (element in s) {
            if (element.isLowerCase()) {
                answer += ((element.toInt() + n) % 26 + 78).toChar()
            } else if (element.isUpperCase()) {
                answer += ((element.toInt() + n) % 26 + 52).toChar()
            } else {
                answer += " "
            }
        }
        return answer
    }
}
