//Link:https://leetcode.com/problems/number-of-good-pairs/
//tc:O(n)
//sc:O(n)
//Status: Solved ✅ | Date: 2025-07-28

import java.util.HashMap;
class NumberOfGoodPairs{
    public int numIdenticalPairs(int[] nums) {
        int pairs = 0;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i : nums)hmap.put(i, hmap.getOrDefault(i,0)+1);
        for(int i : hmap.keySet()){
            int n = hmap.get(i);
            int count = n*(n-1)/2;
            pairs += count;
        }
        return pairs;
    }
}