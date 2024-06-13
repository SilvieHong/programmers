//https://school.programmers.co.kr/learn/courses/30/lessons/12918
class Solution {
    public boolean solution(String s) {
        if(s.length()==4 || s.length()==6){
            try {
                Integer.parseInt(s);
            }catch(NumberFormatException e){
                return false;
            }
        }else{
            return false;
        }
        return true;
    }
}
