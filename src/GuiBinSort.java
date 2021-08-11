import java.util.Arrays;

public class GuiBinSort {
    public static int[] sort(int[] nums, int low, int high){
        int half = (high + low)/2;
        while(low<high){
            sort(nums, low, half);
            sort(nums, half+1, high);
            merge(nums, low, half, high);
        }
        return nums;
    }

    private static void merge(int[] nums, int low, int half, int high) {
        int[] temp = new int[high-low+1];
        int i = low;
        int j = half+1;
        int k=0;
        while(i<=half && j<=high){
            if(nums[i]<nums[j]){
                temp[k++] = nums[i++];
            }
            else {
                temp[k++] = nums[j++];
            }
        }
        if(i<=half){
            temp[k++] = nums[i++];
        }
        if(j<=high){
            temp[k++] = nums[j++];
        }
        for(int n=0; n<temp.length; n++){
            nums[n+low] = temp[n];
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,6,4,5,2};
        nums = sort(nums, 0, 4);
        System.out.println(Arrays.toString(nums));
        //return Arrays.toString(nums);
    }
}
