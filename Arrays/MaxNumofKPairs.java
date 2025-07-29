//Link:https://leetcode.com/problems/max-number-of-k-sum-pairs/
//tc:O(n logn)
//sc:O(1)
//Status: Solved ✅ | Date: 2025-07-29

import java.util.Arrays;
class MaxNumofKPairs{
    public int maxOperations(int[] nums, int k){
     Arrays.sort(nums);
        int count = 0;
        // HashSet<Integer> hset = new HashSet<>();
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int sum = nums[left]+nums[right];
                if(sum == k){
                count++;
                left++;
                right--;
            }else if(sum > k) right--;
            else left++;
        }
        return count;
    }
}