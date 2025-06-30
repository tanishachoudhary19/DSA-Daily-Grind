//link:https://leetcode.com/problems/longest-harmonious-subsequence/?envType=daily-question&envId=2025-06-30
//TC : O(N)
//SC: O(N)
// Status: Solved ✅ | Date: 2025-06-30

import java.util.*;
class LongestHarmoniousSubseq{
       public int findLHS(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int maxlen = 0;
        for(int num : nums){
            hmap.put(num, hmap.getOrDefault(num,0)+1);
        }
        for(int num : hmap.keySet()){
            if(hmap.containsKey(num+1)){
                int count = hmap.get(num)+ hmap.get(num+1);
                maxlen = Math.max(maxlen,count);
            }
        }
        return maxlen;
    }
}