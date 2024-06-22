class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""

        for (element in s) {
            if (element.toInt() in 97..122) {
                if(element.toInt()+n >122){
                    answer += (element.toInt()+n-26).toChar()
                }else{
                    answer += (element.toInt() + n).toChar()
                }
            } else if (element.toInt() in 65..90) {
                if(element.toInt()+n >90){
                    answer += (element.toInt()+n-26).toChar()
                }else{
                    answer += (element.toInt() + n).toChar()
                }
            } else {
                answer += " "
            }
        }
        return answer
    }
}
