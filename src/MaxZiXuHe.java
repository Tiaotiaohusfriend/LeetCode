public class MaxZiXuHe {
    public static int maxSubArray(int[] nums) {
        int pre = 0;
        int MaxA = nums[0];
        for(int num : nums){
            pre = Math.max(pre+num,num);
            MaxA = Math.max(pre, MaxA);
        }
        return MaxA;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,-1,3,4};
        System.out.println(maxSubArray(nums));
    }
}
