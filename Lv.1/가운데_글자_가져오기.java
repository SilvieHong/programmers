//https://school.programmers.co.kr/learn/courses/30/lessons/12903
class Solution {
    public String solution(String s) {
        int l = s.length();
        StringBuilder sb = new StringBuilder();
        if(l%2==1){
            return sb.append(s.charAt(l/2)).toString();
        }else{
            sb.append(s.charAt(l/2-1));
            sb.append(s.charAt(l/2));
            return sb.toString();
        }
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
