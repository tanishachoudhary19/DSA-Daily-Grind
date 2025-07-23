//Link:https://leetcode.com/problems/search-insert-position/
//tc:O(log n)
//sc:O(1)
//Status: Solved ✅ | Date: 2025-07-23

class searchInsertPosition{
public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target) return mid;
            else if(target > nums[mid]) left = mid+1;
            else right = mid-1; 
        }
        return left;
    }
}