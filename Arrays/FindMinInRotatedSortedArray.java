//link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
//Tc : O(log N)
// Sc : O(1)
// Status: Solved ✅ | Date: 2025-07-06

class FindMinInRotatedSortedArray{
    public int findMin(int[] nums){
        int left = 0;
        int right = nums.length-1;
        int ans = Integer.MAX_VALUE;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] > nums[right] && nums[left] > nums[right]){
                left = mid+1;
                ans = Math.max(nums[mid], ans);
            }else{
                right = mid-1;
                ans = Math.max(nums[mid], ans);
            }
        }
        return ans;
    }
}