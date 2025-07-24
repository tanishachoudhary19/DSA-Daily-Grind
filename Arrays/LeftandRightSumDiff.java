//Link:https://leetcode.com/problems/left-and-right-sum-differences/
//tc:O(n)
//sc:O(n)
//Status: Solved ✅ | Date: 2025-07-24


class LeftandRightSumDiff{
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        left[0] = 0;
        int[] right = new int[n];
        right[n-1] = 0;
        for(int i=1; i<n; i++){
            left[i] = nums[i-1] + left[i-1];
        }
        for(int i=n-2; i>=0; i--){
            right[i] = nums[i+1] + right[i+1];
        }
        for(int i=0; i<n; i++){
            nums[i] = Math.abs(left[i]-right[i]);
        }
        return nums;
    }
}