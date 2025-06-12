//Link:https://leetcode.com/problems/permutation-difference-between-two-strings/
//tc:O(N)
//sc:O(N)
// Status: Solved ✅ | Date: 2025-06-12

import java.util.*;
class PermutationDiffBtwStrings{
    public int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer> hmap = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            hmap.put(c,i);
        }
        int sum = 0;
        for(int i=0; i<t.length(); i++){
            char c = t.charAt(i);
            if(hmap.containsKey(c)){
                int sindex = hmap.get(c);
                sum += Math.abs(sindex-i);
            }
        }
        return sum;
    }
}
