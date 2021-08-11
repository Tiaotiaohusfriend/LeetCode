import java.awt.print.PrinterGraphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumsZhiHe {
    public static List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(len < 3)return res;
        Arrays.sort(nums);

        for(int i=0; i<len; i++){
            int left = i+1;
            int right = len-1;
            if(nums[i] > 0) continue;
            if(i>0 && nums[i]==nums[i-1])continue;
            while(left < right){
                int sum = nums[left] + nums[right];
                if(sum == -nums[i]){
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(left < right && nums[right+1] == nums[right]){
                        right--;
                    }
                }else if(sum < -nums[i]){
                    left++;
                }else{
                    right--;
                }

            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-5,0,1,2,3,4,5};
        List<List<Integer>> res = threeSum(nums);
        for(List<Integer> list : res){
            System.out.println(list);
        }
    }
}
