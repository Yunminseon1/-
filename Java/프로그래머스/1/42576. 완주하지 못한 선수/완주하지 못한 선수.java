import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        // 참가자 넣기
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        // 완주자 빼기
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }

        // 값이 1인 사람 찾기
        for (String key : map.keySet()) {
            if (map.get(key) > 0) {
                return key;
            }
        }

        return "";
    }
}

