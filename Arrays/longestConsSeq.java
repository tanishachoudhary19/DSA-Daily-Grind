//Link:https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
//tc:O(n)
//sc:O(n)
//Status: Solved ✅ | Date: 2025-07-14

import java.util.*;
class longestConsSeq{
    public int longestConsecutive(int[] nums){
        HashSet<Integer> hset = new HashSet<>();
        int maxlen = 0;
        for(int num : nums)hset.add(num);
        for(int num : hset){
            if(!hset.contains(num-1)){
                int curr = num;
                int count = 1;
                while(hset.contains(curr+1)){
                    curr++;
                    count++;
                }
                maxlen = Math.max(maxlen,count);
            }
        }
        return maxlen;
    }
}