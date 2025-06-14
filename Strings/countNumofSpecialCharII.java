//link: https://leetcode.com/problems/count-the-number-of-special-characters-ii/
//Tc: O(N)
//Sc: O(1)
// Status: Solved ✅ | Date: 2025-06-14

import java.util.*;
class countNumofSpecialCharII{
     public int numberOfSpecialChars(String word) {
        HashMap<Character,Integer> UpperFirst = new HashMap<>();
        HashMap<Character,Integer> LowerLast = new HashMap<>();

        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            if(Character.isUpperCase(c)){
                UpperFirst.putIfAbsent(c,i);
            }else LowerLast.put(c,i);
        }

        int count = 0;
        for(char c = 'a'; c <= 'z'; c++){
            char ch = Character.toUpperCase(c);
            if(UpperFirst.containsKey(ch) && LowerLast.containsKey(c)){
                if(UpperFirst.get(ch) > LowerLast.get(c)){
                    count++;
                }
            }
        }
        return count;
    }

}