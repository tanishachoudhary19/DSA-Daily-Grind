//Link:https://leetcode.com/problems/sum-of-beauty-of-all-substrings/
//tc:O(n2)
//sc: O(n)
//Status: Solved ✅ | Date: 2025-08-2

import java.util.HashMap;
class sumofBeauty{
    public int beautySum(String s) {
        int total = 0;
        for(int i=0; i<s.length(); i++){
        HashMap<Character,Integer> hmap = new HashMap<>();
        for(int j=i; j<s.length(); j++){
        char c = s.charAt(j);
        hmap.put(c,hmap.getOrDefault(c,0)+1);
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        for(int count : hmap.values()){
            maxi = Math.max(maxi,count);
            mini = Math.min(mini,count);
        }
        total += (maxi-mini);
        }
        }
        return total;
    }
}