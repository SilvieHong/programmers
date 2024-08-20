import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int time = 0;
        List<String> cache = new ArrayList<>();
        
        for (String city : cities) {
            city = city.toLowerCase();
            int idx = cache.indexOf(city);

            if (idx >= 0) {
                cache.remove(idx);
                cache.add(city);
                time++;
            } else {
                cache.add(city);
                time += 5;
            }

            if (cache.size() > cacheSize) cache.remove(0);
        }
        return time;
    }
}
