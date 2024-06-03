//https://school.programmers.co.kr/learn/courses/30/lessons/12941
import java.util.Arrays;
class Solution {
    public int solution(int []A, int []B) {
        int sum = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0; i<A.length;i++){
            sum += A[i] *B[A.length-1-i];
        }
        return sum;
    }
}
/**
 * Complexity:
 * Time:O(nlogn) and Space:O(n)
 */
