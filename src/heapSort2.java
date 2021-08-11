public class heapSort2 {
    public static void main(String[] args) {
        int[] arr = {2,5,3,4,1,};
        heapsort(arr);
        for(int num : arr){
            System.out.print(num);
        }
    }

    private static void heapsort(int[] arr) {
        for(int i=(arr.length-1)/2; i>=0; i--){
            buildHeap(arr,i, arr.length);
        }
        for(int i=arr.length-1; i>0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            buildHeap(arr, 0, i);
        }
    }

    private static void buildHeap(int[] arr, int i, int n) {
        int j = 2*i+1;
        while(j < n){
            if(j+1<n && arr[j+1]>arr[j]){
                j++;
            }
            if(arr[i] >= arr[j]){
                break;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i = j;
            j = 2*i +1;
        }
    }
}
