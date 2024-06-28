class Solution {
    var vowel = charArrayOf('A','E','I','O','U')
    var list = mutableListOf<String>()
    
    fun solution(word: String): Int {
        dfs("")
        list.forEachIndexed{idx,_->
            if(list[idx] == word) return idx
        }
        return 0
    }
    
    fun dfs(input : String){
        list.add(input)
        if(input.length == 5) return
        for(element in vowel){
            dfs(input + element)
        }
    }
}
