//Link:https://leetcode.com/problems/subarray-sum-equals-k/
//tc:O(n)
//sc:O(n)
//Status: Solved ✅ | Date: 2025-07-15

import java.util.*;
class subarrSumequalsK {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int count = 0;
        int sum = 0;
        hmap.put(0,1);
        for(int num : nums){
            sum += num;
            if(hmap.containsKey(sum-k)){
                count += hmap.get(sum-k);
            }
            hmap.put(sum, hmap.getOrDefault(sum,0)+1);
        }
        return count;
    }
}