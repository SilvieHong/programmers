//https://school.programmers.co.kr/learn/courses/30/lessons/161990
class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int [4];
        int max_col = Integer.MIN_VALUE;
        int min_col = Integer.MAX_VALUE;
        int max_row = Integer.MIN_VALUE;
        int min_row = Integer.MAX_VALUE;
        for(int i=0; i<wallpaper.length; i++){
            if(wallpaper[i].contains("#")){
                max_row = Math.max(max_row,i);
                max_col = Math.max(max_col,wallpaper[i].lastIndexOf('#'));
                min_row = Math.min(min_row,i);
                min_col = Math.min(min_col,wallpaper[i].indexOf('#'));

            }
        }
        answer[0] = min_row;
        answer[1] = min_col;
        answer[2] = ++max_row;
        answer[3] = ++max_col;
        return answer;
    }
}
