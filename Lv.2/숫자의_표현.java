class Solution {
    public int solution(int n) {
        int cnt = 0;
        int head = 1;
        int sum = 0;

        for(int i=0; i<=n;i++){
            sum += i;
            while(sum > n){
                sum -= head;
                head++;
            }
            if(sum ==n) cnt++;
        }
        return cnt;
    }
}
