// Problem: Two Sum
// Link: https://leetcode.com/problems/two-sum/
// Time: O(n), Space: O(n)
// Status: Solved ✅ | Date: 2025-05-31

import java.util.*;
public class TwoSum{
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int next = target-nums[i];
            if(hmap.containsKey(next)){
                return new int[] {hmap.get(next),i};
            }
            hmap.put(nums[i],i);
        }
        return new int[]{};
    }
}


//The approch i initially thought was fixing one number then checking for another
//T.C = O(N^2)
//S.C = O(N)

