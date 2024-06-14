//https://school.programmers.co.kr/learn/courses/30/lessons/77884
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            getDivisorCnt(i);
            answer += getDivisorCnt(i) % 2 == 0 ? i : -i;
        }
        return answer;
    }
    
    public static int getDivisorCnt(int num) {
        int cnt = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) cnt++;
        }
        return cnt;
    }
}
