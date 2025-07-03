//link:https://leetcode.com/problems/move-zeroes/
//TC: O(N)
//SC: O(1)
// Status: Solved ✅ | Date: 2025-07-03

class movesZeroes{
    public void moveZeroes(int[] nums){
        int left = 0;
        int right = 0;
        for(int i=right; i<nums.length; i++){
            if(nums[right] != 0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
            right++;
        }
    }
}