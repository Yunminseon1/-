import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
    Queue<Integer> queue = new LinkedList<>();
        
        // 1. 기능별 완료 날짜 계산 
        for(int i =0; i < progresses.length; i++ ){
        int remain = 100 - progress[i];
        int day = (remain + speeds[i] - 1) / speeds[i];
        queue.offer(day);
    }
        List<Integer> result = new ArrayList<>();
        
        //2. 배포 단위 계산 
        while(!queue.isEmpty()){
            int current = queue.poll();
            int count = 1;
        }
        
        while(!queue.isEmpty() && queue.peek() <= current)queue.poll();
        count++;
        }    
    result.add(count);
}
return result.stream().mapToInt(i->i). toArray();
        
    }
}