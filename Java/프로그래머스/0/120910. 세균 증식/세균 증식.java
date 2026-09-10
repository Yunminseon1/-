// n을 t 만큼 제곱한것이 세균의 수 
// ex) n = 5 t = 9 
// 5*5*5*5*5*5*5*5*5
// 
class Solution {
    public int solution(int n, int t) {
        
        int answer = n * (int) Math.pow(2,t);  
        return answer;
    }
}