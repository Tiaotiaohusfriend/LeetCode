public class GuiBsort {
    public static void main(String[] args) {
        int[] nums = {5,3,1,4,2};
        sort(nums, 0, nums.length-1);
        for(int num : nums){
            System.out.print(num);
        }
    }

    private static void sort(int[] nums, int l, int r) {
        int mid =  l+(r-l)/2;
        if(l < r){
            sort(nums, l, mid);
            sort(nums, mid+1, r);
            merge(nums, l, mid, r);
        }
    }

    private static void merge(int[] nums, int l, int mid, int r) {
        int[] temp = new int[r-l+1];
        int i = l;
        int j = mid+1;
        int idx = 0;
        while(i<=mid && j<=r){
            if(nums[i] < nums[j]){
                temp[idx++] = nums[i++];
            }else{
                temp[idx++] = nums[j++];
            }
        }
        while(i<=mid){
            temp[idx++] = nums[i++];
        }
        while(j<=mid){
            temp[idx++] = nums[j++];
        }
        for(int k=0; k<r-l+1; k++){
            nums[l+k] = temp[k];
        }
    }
}
