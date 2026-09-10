import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        
        // 1.의상 종류별로 갯수 카운트 
        for (String[] item : clothes){
            String type = item[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        
         // 2. 조합 계산 (각 종류마다 +1 한 값 곱하기)
        int answer = 1;
        for(int count : map.values()){
            answer *= (count +1); // 입지않는 경우 포함 
        }
        
        // 3. 아무것도 안입는 경우 제거 
        return answer - 1;
    }
}