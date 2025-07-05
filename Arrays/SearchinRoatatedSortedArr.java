//link: https://leetcode.com/problems/search-in-rotated-sorted-array/
//Tc : O(log N)
// Sc : O(N)
// Status: Solved ✅ | Date: 2025-07-05

class SearchinRoatatedSortedArr{
public int search(int[] nums, int target){
    int left = 0;
    int right = nums.length-1;
    while(left <= right){
        int mid = left + (right-left)/2;
        if(nums[mid] == target) return mid;
        if(nums[left] <= nums[mid]){
            if(nums[left] <= target && target < nums[mid]) right = mid-1;
            else left = mid+1;
        }else{
            if(target <= nums[right] && target > nums[mid]) left = mid+1;
            else right = mid-1;
        }
    }
    return -1;
}
}