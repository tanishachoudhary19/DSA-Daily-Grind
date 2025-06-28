//link:https://leetcode.com/problems/rearrange-characters-to-make-target-string/
//Tc:O(n)
//Sc:O(1)
// Status: Solved ✅ | Date: 2025-06-28

import java.util.*;
class RearrangeCharToMakeTarget{
   public int rearrangeCharacters(String s, String target) {
        int count = Integer.MAX_VALUE;
        HashMap<Character,Integer> hmap1 = new HashMap<>();
        for(char c : s.toCharArray()){
            hmap1.put(c,hmap1.getOrDefault(c,0)+1);
        }
        HashMap<Character,Integer> hmap2 = new HashMap<>();
        for(char c : target.toCharArray()){
            hmap2.put(c,hmap2.getOrDefault(c,0)+1);
        }
        for(char c : hmap2.keySet()){
            int available = hmap1.getOrDefault(c,0);
            int req = hmap2.get(c);
            count = Math.min(count, available/req);
        }
        return count;
    }
}