//link:https://leetcode.com/problems/maximum-number-of-balloons/
//Tc:O(n)
//Sc:O(1)
// Status: Solved ✅ | Date: 2025-06-28

import java.util.*;
class MaxNumofBalloons{
 public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> hmap1 = new HashMap<>();
        for(char c : text.toCharArray()){
            hmap1.put(c, hmap1.getOrDefault(c,0)+1);
        }
        String word = "balloon";
        HashMap<Character,Integer> hmap2 = new HashMap<>();
        for(char c : word.toCharArray()){
            hmap2.put(c, hmap2.getOrDefault(c,0)+1);
        }
        int min = Integer.MAX_VALUE;
        for(char c : hmap2.keySet()){
            int available = hmap1.getOrDefault(c,0);
            int required = hmap2.get(c);
            min = Math.min(min, available/required);
        }
        return min;
    }
}