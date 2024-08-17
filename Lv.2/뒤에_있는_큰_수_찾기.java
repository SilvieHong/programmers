import java.util.Stack;

class Solution {
    public int[] solution(int[] numbers) {
        int [] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=numbers.length-1; i>=0; i--){
            while(!stack.empty()){
                if(stack.peek()<=numbers[i]){
                    stack.pop();
                }else{
                    answer[i] = stack.peek();
                    break;
                }
            }
            if(stack.empty()) answer[i] = -1;
            stack.push(numbers[i]);
        }
        return answer;
    }
}

// 시간초과
// import java.util.Arrays;

// class Solution {
//     public int[] solution(int[] numbers) {
//         int[] answer = new int[numbers.length];
//         Arrays.fill(answer, -1);
        
//         for (int i = 0; i < numbers.length; i++) {
//             for (int j = i + 1; j < numbers.length; j++) {
//                 if (numbers[j] > numbers[i]) {
//                     answer[i] = numbers[j];
//                     break;
//                 }
//             }
//         }
//         return answer;
//     }
// }
