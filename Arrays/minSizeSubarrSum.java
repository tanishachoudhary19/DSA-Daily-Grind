//LINK : https://leetcode.com/problems/minimum-size-subarray-sum/description/
//T.C :O(N)
//S.C:O(1)
// Status: Solved ✅ | Date: 2025-06-05


class minSizeSubarrSum{
public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int minlen = Integer.MAX_VALUE;
        while(right < nums.length){
           sum += nums[right];
           while(sum >= target){
            if(right-left+1 < minlen){
                minlen = right-left+1;
            }
            sum -= nums[left];
            left++;
           }
           right++;
            }
            return (minlen == Integer.MAX_VALUE) ? 0 : minlen;
        }
}