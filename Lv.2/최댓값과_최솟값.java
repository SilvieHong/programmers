//https://school.programmers.co.kr/learn/courses/30/lessons/12939
class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < str.length; i++) {
            max = Math.max(max, Integer.parseInt(str[i]));
            min = Math.min(min, Integer.parseInt(str[i]));
        }
        String ans;
        ans = min + " " + max;
        return ans;
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
