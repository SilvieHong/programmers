class Solution {
    fun solution(elements: IntArray): Int {
        val set = mutableSetOf<Int>()

        for(i in 1..elements.size){
            for(j in 0..elements.size-1){
                var sum = 0
                for(k in j until i+j){
                    sum += elements[k%elements.size]
                }
                set.add(sum)
            }
        }
        return set.size
    }
}
