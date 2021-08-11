public class qsort {
    public static void main(String[] args) {
        int[] nums = {8,1,5,4,2,7};
        qsort(nums, 0, nums.length-1);
        for(int num : nums){
            System.out.print(num);
        }
    }

    private static void qsort(int[] nums, int l, int r) {
        if(l >= r )return ;
        int key = nums[l];
        int i = l;
        int j = r;
        while(i < j){
            while(i<j && nums[j] >= key){
                j--;
            }
            if(i<j){
                nums[i] = nums[j];
            }
            while(i<j && nums[i] < key){
                i++;
            }
            if(i<j) {
                nums[j] = nums[i];
            }
        }
        nums[i] = key;
        qsort(nums, l, i-1);
        qsort(nums, i+1, r);
    }
}
