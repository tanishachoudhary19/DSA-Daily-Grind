//Link:https://leetcode.com/problems/longest-common-prefix/
//tc:O(nlogn + m)
//sc:O(1)
//Status: Solved ✅ | Date: 2025-07-30

import java.util.Arrays;
class LongestCommanPrefix{
      public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        StringBuilder res = new StringBuilder();
        for(int i=0; i<first.length(); i++){
            if(i < last.length() && first.charAt(i) == last.charAt(i)) res.append(first.charAt(i));
            else break;
        }
        return res.toString();
    }
}