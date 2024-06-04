//https://school.programmers.co.kr/learn/courses/30/lessons/12951
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder(s.toLowerCase());
        if(s.length()==1 && isAlphabet(s.charAt(0))){
            return s.toUpperCase();
        }
        for (int i = 0; i < sb.length()-1; i++) {
            if(i==0 &&isAlphabet(sb.charAt(i))){
                sb.replace(i,i+1,capitalize(sb.charAt(i)));
            }else if (sb.charAt(i) == ' ' && sb.charAt(i + 1) != ' ') {
                if (isAlphabet(sb.charAt(i + 1))) {
                    sb.replace(i+1,i+2, capitalize(sb.charAt(i+1)));
                }
            }
        }
        return sb.toString();
    }
    
    private static String capitalize(char c) {
        return Character.toString(c).toUpperCase();
    }

    private static boolean isAlphabet(char c) {
        return (int) c >= 97 && (int) c <= 122;
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
