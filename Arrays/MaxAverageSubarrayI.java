//LINK:https://leetcode.com/problems/maximum-average-subarray-i/description/
//T.C:O(N)
//S.C:O(N)
// Status: Solved ✅ | Date: 2025-06-04

class MaxAverageSubarrayI{
     public double findMaxAverage(int[] nums, int k) {
       double sum = 0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        double maxSum = sum;
        for(int i=k; i<nums.length; i++){
            sum = sum-nums[i-k] + nums[i];
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum/k;
    }
}