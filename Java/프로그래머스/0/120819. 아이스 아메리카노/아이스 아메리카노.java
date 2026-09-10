class Solution {
    public int[] solution(int money) {

        int quotient = money / 5500;  // 몫
        int remainder = money % 5500; // 나머지

        int[] answer = {quotient, remainder};

        return answer;
    }
}