//https://school.programmers.co.kr/learn/courses/30/lessons/12909
import java.util.Stack;
class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.add(s.charAt(i));
            } else {
                if (stack.peek() == '(' && s.charAt(i) == ')') {
                    stack.pop();
                } else {
                    stack.add(s.charAt(i));
                }
            }
        }
        return stack.isEmpty();
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
