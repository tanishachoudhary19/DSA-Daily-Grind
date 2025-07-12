//TC: O(n log n)
//SC: O(log n)
// Status: Solved ✅ | Date: 2025-07-12

class QuickSort{
    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pivotIndex = partiton(arr, low, high);
            quickSort(arr, low, pivotIndex);
            quickSort(arr, pivotIndex+1, high);
        }
    }
    public static int partiton(int[]arr, int low, int high){
        int pivot = low;
        int i = low+1;
        int j = high-1;
        while(i <= j){
            while(i <= high && arr[i] <= arr[pivot]) i++;
            while(j >= low && arr[j] > arr[pivot]) j--;
            if(i < j){
                swap(arr,i,j);
            }
        }
        swap(arr,pivot,j);
        return j;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}