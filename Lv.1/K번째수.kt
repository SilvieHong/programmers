class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val answer = mutableListOf<Int>()
        val arr = mutableListOf<Int>()

        for(command in commands){
            for(i in command[0]-1..command[1]-1){
                arr.add(array[i])
            }
            answer.add(arr.sorted()[command[2]-1])
            arr.clear()
        }
        
        return answer.toIntArray()
    }
}
