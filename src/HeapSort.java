import java.util.Arrays;

public class HeapSort {
    public static void heapSort(int[] nums){
        int len = nums.length;
        for(int i=(len-1)/2; i>= 0; i--){
            buildHeap(nums, i, len);
        }
        for(int i=len-1; i>0; i--){
            int temp = nums[i];
            nums[i] = nums[0];
            nums[0] = temp;
            buildHeap(nums, 0, i);
        }
    }

    private static void buildHeap(int[] nums, int fa, int len) {
        int temp = nums[fa];
        int lChild = fa*2+1;
        while(lChild < len){
            int rChild = lChild + 1;
            if(nums[lChild] < nums[rChild] && rChild < len){
                lChild += 1;
            }
            if(temp >= nums[lChild]) break;
            nums[fa] = nums[lChild];
            fa = lChild;
            lChild = lChild*2+1;
        }
        nums[fa] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,5,4,3};
        heapSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
