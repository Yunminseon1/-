class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);// n을 문자형으로 바꾸기
        
        int[] answer = new int[str.length()];// str의 크기와 같은 정수형 배열 answer 선언 
        
        for(int i = 0; i < str.length(); i++){
            answer [i] = (int)(n % 10);
            n /= 10;
        }
        return answer;
    }
}