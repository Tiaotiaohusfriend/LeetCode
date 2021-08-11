import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuanPaiLie2 {
    public static List<List<Integer>> permuteUnique(int[] nums){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> output = new ArrayList<Integer>();
        Arrays.sort(nums);
        int l = nums.length;
        Boolean[] status = new Boolean[l];
        for(Boolean s : status){
            s = false;
        }
        backtrace(res, output, nums, l, 0, status);
        return res;
    }

    private static void backtrace(List<List<Integer>> res, List<Integer> output,int[] nums, int l, int index, Boolean[] status) {
        if(index == l){
            res.add(new ArrayList<Integer>(output));
            return;
        }
        for(int i=0; i<l; i++){
            if(status[i] || (i>0&&nums[i]==nums[i-1]&&!status[i-1])) {
                continue;
            }
            output.add(nums[i]);
            status[i] = true;
            backtrace(res, output, nums, l, index+1, status);
            output.remove(index);
            status[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(permuteUnique(nums));
    }
}
