public class ShanChuPaiXuShuZhuDeChongFuXiang {
    public static int deleteDuplicates(int[] nums){
        int len = nums.length;
        int left=0,right = 0;
        for(int i=1; i<len; i++){
            if(nums[i] != nums[i-1]){
                left++;
                nums[left] = nums[i];
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(deleteDuplicates(nums));
    }
}
