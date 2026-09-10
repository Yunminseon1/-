import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        // [1단계] 저장 공간(사전) 만들기
        HashMap<String, Integer> scoreMap = new HashMap<>();
        
        // [2단계] 사전에 이름과 점수 채워 넣기
        for (int i = 0; i < name.length; i++) {
            scoreMap.put(name[i], yearning[i]);
        }
        
        // [3단계] 정답을 담을 바구니 크기 정하기
        int[] answer = new int[photo.length];
        
        // [4단계] 사진첩을 한 장씩 확인하며 점수 계산하기
        for (int i = 0; i < photo.length; i++) {
            int sum = 0; // 한 장의 사진 점수 초기화
            
            for (int j = 0; j < photo[i].length; j++) {
                String person = photo[i][j]; // 사진 속 사람 이름
                
                // 사전에서 점수를 찾아서 누적 (없으면 0점)
                sum += scoreMap.getOrDefault(person, 0);
            }
            answer[i] = sum; // 계산된 총점을 정답 배열에 저장
        }
        
        // [5단계] 모든 사진의 점수가 담긴 정답 반환
        return answer;
    }
}