//tc: O(LOG N)
//sc : O(LOG N)
// Status: Solved ✅ | Date: 2025-07-12

import java.util.*;
class MERGESort{
    static void merge(int arr[], int left, int mid, int right){
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
        
        int i=0, j=0, k=left;
        while(i < n1 && j<n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i < n1) arr[k++] = L[i++];
        while(j < n2) arr[k++] = R[j++];

    }
    static void mergesort(int arr[], int left, int right){
       if(left < right){
         int mid = left + (right-left)/2;
        mergesort(arr, left , mid);
        mergesort(arr,mid+1,right);
        merge(arr,left,mid,right);
       }   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("original array: " + arr[n]);
        mergesort(arr,0,n-1);
        System.out.println("Sorted array: " + arr[n]);

    }
}