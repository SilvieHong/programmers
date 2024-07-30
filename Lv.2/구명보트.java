import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int cnt = 0;
        int head = 0;
        int tail = people.length-1;

        while(head <= tail){
            cnt++;
            if(people[head] + people[tail]<=limit) head++;
            tail--;
        }
        return cnt;
    }
}
