import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> pq = new PriorityQueue<>((m1, m2) -> m2 - m1);
        for(int i : input){
            while(pq.size() < k){
                pq.offer(i);
            }
            if(pq.peek() > i){
                pq.poll();
                pq.offer(i);
            }
        }
        while(!pq.isEmpty()){
            res.add(pq.poll());
        }
        return res;
    }
}
