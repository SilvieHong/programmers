// 시간초과
// import java.util.HashSet;
// import java.util.Set;

// class Solution {
//     public int solution(int[] topping) {
//         int cnt = 0;

//         for (int i = 0; i < topping.length; i++) {
//             Set<Integer> a = new HashSet<>();
//             Set<Integer> b = new HashSet<>();

//             for (int j = 0; j < i; j++) {
//                 a.add(topping[j]);
//             }

//             for (int k = i; k < topping.length; k++) {
//                 b.add(topping[k]);
//             }

//             if (a.size() == b.size()) cnt++;
//         }
        
//         return cnt;
//     }
// }
