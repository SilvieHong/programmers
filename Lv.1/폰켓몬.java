//https://school.programmers.co.kr/learn/courses/30/lessons/1845
import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int pick = nums.length / 2;
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        return set.size() >= pick ? pick : set.size();
    }
}
