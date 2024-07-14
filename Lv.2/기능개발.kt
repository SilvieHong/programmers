import java.util.LinkedList
import java.util.Queue

class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val size = progresses.size
        val deadline : Queue<Int> = LinkedList()

        for(i in 0 until size){
            deadline.add(Math.ceil((100-progresses[i])/speeds[i].toDouble()).toInt())
        }

        var answer = mutableListOf<Int>()
        while(!deadline.isEmpty()){
            var cnt = 1
            var poll = deadline.poll()

            while(!deadline.isEmpty()&&deadline.peek() <= poll){
                deadline.remove()
                cnt++
            }
            answer.add(cnt)
        }
        return answer.toIntArray()
    }
}
