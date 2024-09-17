//https://school.programmers.co.kr/learn/courses/30/lessons/132265
import java.util.HashMap;

class Solution {
    public int solution(int[] topping) {
        int cnt = 0;
        int n = topping.length;
        HashMap<Integer, Integer> mapA = new HashMap<>();
        HashMap<Integer, Integer> mapB = new HashMap<>();

        mapA.put(topping[0], 1);
        for (int i = 1; i < n; i++) {
            mapB.put(topping[i], mapB.getOrDefault(topping[i], 0) + 1);
        }

        int pt = 1;
        while (pt < n - 1) {
            if (mapA.size() == mapB.size()) cnt++;
            int current = topping[pt];

            mapA.put(current, mapA.getOrDefault(current, 0) + 1);

            if (mapB.get(current) == 1) {
                mapB.remove(current);
            } else {
                mapB.put(current, mapB.get(current) - 1);
            }
            pt++;
        }

        return cnt;
    }
}

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
