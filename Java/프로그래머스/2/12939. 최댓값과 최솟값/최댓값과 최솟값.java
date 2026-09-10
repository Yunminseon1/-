import java.util.Arrays;

class Solution {
    public String solution(String s) {
        // 공백으로 나누어 정수 배열로 변환
        String[] tmp = s.split(" ");
        int[] arr = new int[tmp.length];
        
        for (int i = 0; i < tmp.length; i++) {
            arr[i] = Integer.parseInt(tmp[i]);
            }

        // 정렬 후 최소값, 최대값 구하기
        Arrays.sort(arr);
        return arr[0] + " " + arr[arr.length - 1];
    }
}