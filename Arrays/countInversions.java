//Link:https://www.geeksforgeeks.org/problems/inversion-of-array-1587115620/1
//tc:O(n log n)
//sc:O(n)
//Status: Solved ✅ | Date: 2025-07-23

class countInversions{
static int merge(int arr[], int left, int mid , int right){
        int count = 0;
        int n1 = mid-left+1;
        int n2 = right-mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i=0; i<n1; i++){
            L[i] = arr[left+i];
        }
        for(int j=0; j<n2; j++){
            R[j] = arr[mid+1+j];
        }
        int i=0,j=0,k=left;
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k++] = L[i++];
            }else{
                arr[k++] = R[j++];
                count += (n1-i);
            }
        }
        while(i<n1) arr[k++] = L[i++];
        while(j<n2) arr[k++] = R[j++];
        return count;
    }
     static int mergeSort(int arr[], int left , int right){
        int count = 0;
        if(left < right){
            int mid = (left+right)/2;
            count += mergeSort(arr,left,mid);
            count += mergeSort(arr,mid+1,right);
            count += merge(arr,left,mid,right);
        }
        return count;
     }
        static int inversionCount(int arr[]) {
        // Code Here
        int n = arr.length;
       return  mergeSort(arr,0,n-1);
    }
}