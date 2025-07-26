//Link:https://leetcode.com/problems/maximum-unique-subarray-sum-after-deletion/
//tc:O(n)
//sc:O(n)
//Status: Solved ✅ | Date: 2025-07-25

import java.util.HashSet;
class maxUniqueSubarraySum{
   public int maxSum(int[] nums) {
        HashSet<Integer> hset = new HashSet<>();
        int maxi = Integer.MIN_VALUE;
        for(int num : nums){
            if(num > 0) hset.add(num);
            else maxi = Math.max(maxi,num);
        }
        if(hset.isEmpty()) return maxi;
        int sum = 0;
        for(int num : hset){
            sum += num;
        }
        return sum;
    }
}