public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        int i, j, t, temp;
        if(low > high)return;
        i = low;
        j = high;
        temp = arr[low];
        while (i < j) {
            while (i < j && arr[j] >= temp) j--;
            while (i < j && arr[i] <= temp) i++;
            if (i < j) {
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        arr[low] = arr[i];
        arr[i] = temp;
        quickSort(arr, low, i - 1);
        quickSort(arr, i + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 2, 4, 7, 1, 8, 5, 19};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
