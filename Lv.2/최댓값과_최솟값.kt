class Solution {
    fun solution(s: String): String {
        var list = s.split(" ")
        var min = Integer.MAX_VALUE
        var max = Integer.MIN_VALUE
        
        for(item in list){
            min = Math.min(min, item.toInt())
            max = Math.max(max, item.toInt())
        }
        return "$min $max"
    }
}
