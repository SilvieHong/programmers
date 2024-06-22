class Solution {
    fun solution(x: Int): Boolean {
        var input = x
        var sum: Int = 0
        
        while (input > 0) {
            sum += input % 10
            input /= 10
        }
        
        return x % sum <= 0
    }
}
