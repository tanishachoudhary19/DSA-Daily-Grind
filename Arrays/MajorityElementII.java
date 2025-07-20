//Link:https://leetcode.com/problems/majority-element-ii/
//tc:O(n)
//sc:O(1)
//Status: Solved ✅ | Date: 2025-07-17

import java.util.*;
class MajorityElementII{
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int num : nums){
            hmap.put(num, hmap.getOrDefault(num,0)+1);
        }
        for(int num : hmap.keySet()){
            int count = hmap.get(num);
            if(count > n/3)ans.add(num);
        }
        return ans;
    }
}