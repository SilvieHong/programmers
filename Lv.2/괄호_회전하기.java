import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public int solution(String s) {
        int cnt = 0;
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            queue.add(s.charAt(i));
        }
        if (isValid(queueToString(queue))) cnt++;

        for (int i = 0; i < s.length() - 1; i++) {
            queue.add(queue.poll());
            if (isValid(queueToString(queue))) cnt++;
        }

        return cnt;
    }
    
    private static String queueToString(Queue<Character> queue) {
        StringBuilder sb = new StringBuilder();
        for (Character item : queue) {
            sb.append(item);
        }
        return sb.toString();
    }

    private static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (st.isEmpty()) {
                st.push(s.charAt(i));
            } else{
                if (s.charAt(i) == ')' && st.peek() == '(') {
                    st.pop();
                } else if (s.charAt(i) == ']' && st.peek() == '[') {
                    st.pop();
                } else if (s.charAt(i) == '}' && st.peek() == '{') {
                    st.pop();
                } else {
                    st.push(s.charAt(i));
                }
            }
        }

        return st.isEmpty();
    }
}
