//Link:https://leetcode.com/problems/group-anagrams/description/
//Time Complexity: O(n * k log k)
//Space Complexity: O(n * k)
// Status: Solved ✅ | Date: 2025-06-01

import java.util.*;
class groupAnagram{
public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp = new HashMap<>();
        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            mp.putIfAbsent(key,new ArrayList<>());
            mp.get(key).add(str);
        }
        return new ArrayList<>(mp.values());
    }
}