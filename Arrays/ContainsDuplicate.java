// Problem: Two Sum
//Link : https://leetcode.com/problems/contains-duplicate/description/
// Time: O(n), Space: O(n)
// Status: Solved ✅ | Date: 2025-05-31

import java.util.*;
public class ContainsDuplicate{
      public boolean containsDuplicate(int[] nums) {
            HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int num : nums){
            hmap.put(num,hmap.getOrDefault(num,0)+1);
        }
        for(int num : nums){
            if(hmap.containsKey(num)){
                int count = hmap.get(num);
                if(count > 1) return true;
            }
        }
        return false;
    }
}