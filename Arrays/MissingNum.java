//LINK: https://leetcode.com/problems/missing-number/
//Tc : O(N)
// Sc : O(1)
// Status: Solved ✅ | Date: 2025-07-04

class MissingNum{
    public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
           sum += nums[i];
        }
        int ogSum = (n*(n+1))/2;
        int missingValue = ogSum - sum;
        return missingValue;
    }
}