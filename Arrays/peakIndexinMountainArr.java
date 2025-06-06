//LINK: https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
//TC : O(LOG N)
//SC: O(1)
// Status: Solved ✅ | Date: 2025-06-06


//1. binary search approach with reduced time complexity
class peakIndexinMountainArr{
 public int peakIndexInMountainArray(int[] arr) {
        int left =  0;
        int right = arr.length-1;
        while(left < right){
            int mid = left+(right-left)/2;
            if(arr[mid] < arr[mid+1]){
                left = mid+1;
            } 
            else right = mid;
        }
        return left;
    }
}

//2. a simple log(n) approach is
// int maxi = 0;
//for(int i=0; i<arr.length; i++){
//  if(arr[i] > arr[maxi]) maxi = i;
//}
//return maxi;