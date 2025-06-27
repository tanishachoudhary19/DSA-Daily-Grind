//Link:https://leetcode.com/problems/majority-element/
//TC:O(n)
//SC:O(n)
// Status: Solved ✅ | Date: 2025-06-27

import java.util.*;
class MajorityElements{
     public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int num : nums){
            hmap.put(num, hmap.getOrDefault(num,0)+1);
        }
        for(int num : nums){
            int count = hmap.get(num);
            if(count > n/2) return num;
        }
        return 0;
    }
}