import java.util.Arrays;

public class XuanZhuanShuZu {
        public static void rotate(int[] nums, int k){
            int len = nums.length;
            int[] res = new int[len];
            for(int i=0; i<len; i++){
                res[(i+k)%len] = nums[i];
            }
            System.arraycopy(res, 0,nums,0,len);
        }
}
