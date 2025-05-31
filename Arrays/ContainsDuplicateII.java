//Link:https://leetcode.com/problems/contains-duplicate-ii/description/
//TINE : O(MIN(N,K))
//SPACE: O(N)
// Status: Solved ✅ | Date: 2025-05-31

import java.util.*;
class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(hmap.containsKey(nums[i])){
                int prevIndex = hmap.get(nums[i]);
                int currIndex = i;
                if((currIndex-prevIndex) <= k) return true;
            }
            hmap.put(nums[i], i);
        }
        return false;
    }
}