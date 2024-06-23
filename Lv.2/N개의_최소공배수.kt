class Solution {
    fun solution(arr: IntArray): Int {
        var temp = arr[0]
        for(element in arr){
            temp = lcd(temp, element)
        }
        return temp
    }
    
    fun lcd(a : Int, b : Int) : Int {
        var gcd = gcd(a, b)
        return a*b/gcd
    }
    
    fun gcd(a : Int, b : Int) : Int {
        var gcd = 1
        for(i in 1..Math.max(a,b)){
            if(a%i==0 && b%i==0) gcd =i
        }
        return gcd
    }
}
