//link:https://leetcode.com/problems/number-of-zero-filled-subarrays/
//TC:O(n)
//SC:O(1)
// Status: Solved ✅ | Date: 2025-06-27

class NumOfZeroFilledSubarr{
    public long zeroFilledSubarray(int[] nums) {
        long contCount = 0;
        long subarrays = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                contCount++;
                subarrays += contCount;
            }else{
                contCount = 0;
            }
        }
        return subarrays;
    }
}