import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        
        for (int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }
        
        int time = 0;
        int idx = 0;
        
        while (idx < truck_weights.length) {
            bridge.poll();
            
            if (bridge.stream().mapToInt(i->i).sum() + truck_weights[idx] <= weight) {
                bridge.offer(truck_weights[idx]);
                idx++;
            } else {
                bridge.offer(0);
            }
            
            time++;
        }
        
        return time + bridge_length;
    }
}