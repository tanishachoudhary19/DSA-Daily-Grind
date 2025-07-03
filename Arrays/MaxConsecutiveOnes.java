//link:https://leetcode.com/problems/max-consecutive-ones/
//TC : O(N)
//sc : O(1)
// Status: Solved ✅ | Date: 2025-07-03

class MaxConsecutiveOnes{
       public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int left = 0;
        int right = 0;
        int n = nums.length-1;
        while(right <= n){
            if( nums[left] == 1 && (nums[left] == nums[right])){
                count = Math.max(count , right-left+1);
                right++;
            }
            else{
                left = right;
                left++;
                right++;
            }
        }
        return count;
    }
}