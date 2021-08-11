import java.util.Arrays;

public class QuickSort2 {
    public static void quickSort(int[] nums, int left, int right){
        if(left>=right)return;
        int i = left;
        int j = right;
        int key = nums[left];
        while(i < j){

            while(i<j && nums[j]>=key){
                j --;
            }
            while(i<j && nums[i]<=key){
                i++;
            }
            if(i < j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            nums[left] = nums[i];
            nums[i] = key;
            quickSort(nums, left, i-1);
            quickSort(nums, i+1, right);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,1,4,6,5};
        quickSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
