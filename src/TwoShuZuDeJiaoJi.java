import java.util.*;

public class TwoShuZuDeJiaoJi {
    public static int[] intersect(int[] nums1, int[] nums2){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : nums1){
            int count = map.getOrDefault(num, 0)+1;
            map.put(num, count);
        }
        int[] res = new int[nums1.length];
        int index = 0;
        for(int num : nums2){
            int count = map.getOrDefault(num, 0);
            if(count > 0){
                res[index++] = num;
                count--;
            }
            if(count > 0)
                map.put(num,count);
            else map.remove(num);
        }
        return Arrays.copyOfRange(res, 0, index);
    }

    public static void main(String[] args) {
        int[] num1 = {1,2,3,4,4};
        int[] num2 = {1,2,3,4,4,5};
        System.out.println(intersect(num1, num2));
    }
}
