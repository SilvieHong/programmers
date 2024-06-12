//https://school.programmers.co.kr/learn/courses/30/lessons/12969
import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < b; i++) {
            sb.append("*".repeat(Math.max(0, a)));
            if (i != b - 1) {
                sb.append("\n");
            }

        }
        System.out.println(sb);
    }
}
