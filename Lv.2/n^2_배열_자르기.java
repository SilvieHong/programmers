import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Long> solution(int n, long left, long right) {
        List<Long> answer = new ArrayList<>();
        for (long i = left; i <= right; i++) {
            answer.add(Math.max(i / n, i % n) + 1);
        }
        return answer;
    }
}

/* 1차 풀이 -> 메모리 초과 */
// import java.util.Arrays;

// class Solution {
//     public int[] solution(int n, long left, long right) {
//         int[][] matrix = new int[n][n];

//         for (int i = 0; i < n; i++) {
//             int idx = i+1;
//             for (int j = 0; j < n; j++) {
//                 if(j >= idx) idx++;
//                 matrix[i][j] = idx;
//             }
//         }
        
//         int [] merge = Arrays.stream(matrix).flatMapToInt(Arrays::stream).toArray();
//         return Arrays.copyOfRange(merge, (int) left, (int) right+1);
//     }
// }
