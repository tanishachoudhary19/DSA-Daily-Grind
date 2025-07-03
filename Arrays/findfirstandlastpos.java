//link:https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
//tc: O(log n)
//sc: O(1)
// Status: Solved ✅ | Date: 2025-07-03

class findfirstandlastpos{
    public int binarysearch(int [] nums, int target, boolean firstindex){
        int left = 0;
        int right = nums.length-1;
        int ans = -1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] < target){
                left = mid+1;
            }else if (nums[mid] > target){
                right = mid-1;
            }else{
                ans = mid;
                if(firstindex) right = mid-1;
                else left = mid + 1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target){
        int [] ans = {-1,-1};
        binarysearch(nums,target,true);
        binarysearch(nums,target,false);
        return ans;
    }
}