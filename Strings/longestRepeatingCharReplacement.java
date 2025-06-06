//LiNK:https://leetcode.com/problems/longest-repeating-character-replacement/description/
//T.C = O(N*M)
//SC : O(N)
// Status: Solved ✅ | Date: 2025-06-06


import java.util.*;
class longestRepeatingCharReplacement{
public int characterReplacement(String s, int k){
    HashSet<Character>hset = new HashSet<>();
    int res = 0;
    for(char c : s.toCharArray()){
        hset.add(c);
    }
    for(char c : hset){
        int count = 0;
        int left = 0;
        for(int right =0; right < s.length(); right++){
            if(s.charAt(right) == c) count++;
            if((right-left+1)-count > k){
                if(s.charAt(left) == c) count--;
                left++;
            }
            res = Math.max(right-left+1, res);
        }
    }
    return res;
}
}