import java.util.Stack

class Solution {
    fun solution(number: String, k: Int): String {
        val st = Stack<Char>()
        var k = k
        val keep = number.length - k

        for (element in number) {
            while (st.isNotEmpty() && k > 0 && st.peek() < element) {
                st.pop()
                k--
            }
            st.push(element)
        }

        val answer = StringBuilder()
        while (st.isNotEmpty()) {
            answer.append(st.pop())
        }

        return answer.reverse().substring(0, keep)
    }
}
