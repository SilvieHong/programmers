import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int priority: priorities){
            pq.add(priority);
        }

        int cnt = 0;
        
        while(!pq.isEmpty()){
            for(int i=0; i< priorities.length;i++){
                if(priorities[i] == pq.peek()){
                    pq.poll();
                    cnt++;

                    if(i==location)return cnt;
                }
            }
        }
        return cnt;
    }
}
