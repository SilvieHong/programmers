//https://school.programmers.co.kr/learn/courses/30/lessons/42577
import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])){
                answer=false;
                break;
            }             
        }
        return answer;
    }
}
/**
 * Complexity:
 * Time:O(nlogn) and Space:O(n)
 */
