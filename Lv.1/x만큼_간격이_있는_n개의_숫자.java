//https://school.programmers.co.kr/learn/courses/30/lessons/12954
class Solution {
    public long[] solution(int x, int n) {
        if (n == 1) return new long[]{x};
        long[] ans = new long[n];
        for (int i = 0; i < n; i++) {
            ans[i] += (long)x*(i+1);
        }
        return ans;
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
