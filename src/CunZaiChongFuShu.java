import java.util.HashSet;
import java.util.Set;

public class CunZaiChongFuShu {
    public static boolean containsDup(int[] nums){
        Set<Integer> numsSet = new HashSet<Integer>();
        int len = nums.length;
        for(int i=0; i<len; i++){
            numsSet.add(nums[i]);
        }
        int len2 = numsSet.size();
        return len != len2;
    }

    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(containsDup(nums));
    }
}
