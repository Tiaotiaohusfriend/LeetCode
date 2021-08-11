import sun.reflect.generics.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;

public class huawei2 {
    public static void main(String[] args) {
        int[][] tp = new int[][]{{2,2}, {3,1}, {4,3}};
        int res = solve(tp, 3);
        System.out.println(res);
    }
    public static int solve(int[][] tp, int k) {
        Arrays.sort(tp, (a, b) -> b[1]==a[1] ? b[0]-a[0] : b[1]-a[1]);
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        int max = 0;
        for (int[] arr : tp){
            if(count >= k){
                max = pq.remove();
                count--;
            }
            pq.add(arr[0] + max);
            count++;
        }
        return pq.remove();
    }
}
