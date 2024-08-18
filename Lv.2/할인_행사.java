import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int day = 0;

        Map<String, Integer> wishMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wishMap.put(want[i], number[i]);
        }

        for (int i = 0; i < discount.length - 9; i++) {
            Map<String, Integer> map = new HashMap<>(Map.copyOf(wishMap));
            for (int j = i; j < i + 10; j++) {
                if (map.containsKey(discount[j]) && map.get(discount[j]) > 0) {
                    map.put(discount[j], map.get(discount[j]) - 1);
                }
            }
            if (isValidMap(map)) day++;
        }
        return day;
    }
    
    
    private static boolean isValidMap(Map<String, Integer> map) {
        for (String key : map.keySet()) {
            if (map.get(key) != 0) return false;
        }
        return true;
    }
    
}
