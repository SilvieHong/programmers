class Solution {
    public int solution(int[] citations) {
        int hIndex = 0;

        for (int i = 0; i < citations.length; i++) {
            int cnt = 0;
            for (int j = 0; j < citations.length; j++) {
                if (citations[j] >= citations[i]) cnt++;
            }
            int idx = Math.min(cnt, citations[i]);
            hIndex = Math.max(idx, hIndex);
        }
        return hIndex;
    }
}
