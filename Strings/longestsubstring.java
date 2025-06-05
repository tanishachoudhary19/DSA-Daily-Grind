//LINK:https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
//T.C:O(N)
//S.C:O(N)
// Status: Solved ✅ | Date: 2025-06-04

import java.util.*;
class longestsubstring{
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hset = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxlen = 0;
        while(right < s.length()){
            if(!hset.contains(s.charAt(right))){
                hset.add(s.charAt(right));
                maxlen = Math.max(maxlen,right-left+1);
                right++;
            }else{
                hset.remove(s.charAt(left));
                left++;
            }
        }
        return maxlen;
    }
}