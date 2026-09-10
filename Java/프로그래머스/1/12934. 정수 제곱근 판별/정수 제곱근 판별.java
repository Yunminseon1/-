class Solution {
    public long solution(long n) {
        double x = Math.sqrt(n); // n의 제곱근을 구해서 x에 저장
        
        // 제곱근이 정수인지 확인하고 정수면 1을 더하고 제곱, 아니면 -1 반환
        if ((double)(long) x == x) {
            return (long) ((x + 1) * (x + 1));
        } else {
            return -1;
        }
    }
}