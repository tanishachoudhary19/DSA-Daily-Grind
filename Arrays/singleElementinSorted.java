//Link:https://leetcode.com/problems/single-element-in-a-sorted-array/
//tc:O(n logn)
//sc:O(1)
//Status: Solved ✅ | Date: 2025-07-26

class singleElementinSorted{
  public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int mid = left + (right-left)/2;
            if(mid % 2 == 0 ){
                if(nums[mid] == nums[mid+1]) left = mid+2;
                 else right = mid;
            }else{
                if(nums[mid] == nums[mid-1]) left = mid+1;
                else right = mid;
            }
        }
        return nums[left];
    }
}