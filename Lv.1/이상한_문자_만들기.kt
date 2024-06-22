class Solution {
    fun solution(s: String): String {
        var answer = ""
        var temp = 0
        for (i in s.indices) {
            if(s[i]==' '){
                temp = 0
                answer += ' '
                continue
            }

        if(temp%2==0){
            answer+=s[i].toUpperCase()
            temp++
        }else{
            answer+=s[i].toLowerCase()
            temp++
        }
    }
    return answer
    }
}
