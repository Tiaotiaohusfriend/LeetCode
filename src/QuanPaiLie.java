import javafx.scene.shape.ClosePathBuilder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class QuanPaiLie {
    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> output = new ArrayList<Integer>();
        for(int num : nums){
            output.add(num);
        }
        int l = nums.length;
        backtrace(output,res,l,0);
        return res;
    }

    public static void backtrace(List<Integer> output, List<List<Integer>> res, int l, int index) {
        if(index == l){
            res.add(new ArrayList<Integer>(output));
        }
        for(int i=index; i<l; i++){
            Collections.swap(output, i, index);
            backtrace(output, res, l, index+1);
            Collections.swap(output, i, index);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(permute(nums));
    }
}
