//https://school.programmers.co.kr/learn/courses/30/lessons/12928
class Solution {
    public int solution(int n) {
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                sum += n / i;
                if (i == n / i) {
                    sum -= i;
                }
            }
        }
        return sum;
    }
}
/**
 * Complexity:
 * Time:O(n^(1/2)) and Space:O(1)
 */
