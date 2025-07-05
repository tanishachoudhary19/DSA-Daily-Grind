//link: https://leetcode.com/problems/find-lucky-integer-in-an-array/?envType=daily-question&envId=2025-07-05
//Tc : O(N)
// Sc : O(N)
// Status: Solved ✅ | Date: 2025-07-05

import java.util.*;
class LuckyIntinArr{
     public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int num : arr){
            hmap.put(num, hmap.getOrDefault(num,0)+1);
        }
        int ans = 0;
        for(int num : hmap.keySet()){
            int count = hmap.get(num);
            if(count == num){
                ans = Math.max(ans,num);
            }
        }
        return (ans != 0) ? ans : -1 ;
    }
}