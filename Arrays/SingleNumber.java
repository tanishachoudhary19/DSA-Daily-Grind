//link: https://leetcode.com/problems/single-number/
//Tc : O(N)
// Sc : O(N)
// Status: Solved ✅ | Date: 2025-07-04

import java.util.*;
class SingleNumber{
   public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int num : nums){
            hmap.put(num, hmap.getOrDefault(num,0)+1);
        }
        for(int num : hmap.keySet()){
            if(hmap.containsKey(num)){
                int count = hmap.get(num);
                if(count == 1) return num;
            }
        }
        return -1;
    }
}