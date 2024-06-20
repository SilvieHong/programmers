class Solution {
    fun solution(s: String): String {
        var answer = ""

        for ((idx, item) in s.withIndex()) {
            if (idx == 0 || s[idx - 1].toString() == " ") {
                answer += item.toUpperCase().toString()
            } else {
                answer += item.toLowerCase().toString()
            }
        }
        return answer
    }
}
