//link: https://leetcode.com/problems/kth-missing-positive-number/
//Tc : O(log N)
// Sc : O(1)
// Status: Solved ✅ | Date: 2025-07-06

class KthMissingPositiveNum{
       public int findKthPositive(int[] arr, int k) {
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            int missingCount = arr[mid]-(mid+1);
            if(missingCount < k){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        int ans = left+k;
        return ans;
    }
}