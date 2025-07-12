//Link: https://leetcode.com/problems/find-peak-element/
//TC: O(LOGN)
//SC: O(1);
// Status: Solved ✅ | Date: 2025-07-12
class findPeakElement{
    public int findPeakElement(int[] nums){
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int mid = left+(right-left)/2;
            if(nums[mid] > nums[mid+1]){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
}