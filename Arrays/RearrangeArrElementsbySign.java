//link:https://leetcode.com/problems/rearrange-array-elements-by-sign/
//TC : O(N)
//SC : O(N)
// Status: Solved ✅ | Date: 2025-07-10

import java.util.*;
class RearrangeArrElementsbySign{
    public int[] rearrangeArray(int[] nums){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0) pos.add(nums[i]);
            else neg.add(nums[i]);
        }
        int[] ans = new int[nums.length];
        int i = 0, p = 0, n = 0;
        while(p < pos.size() && n < neg.size()){
            ans[i++] = pos.get(p++);
            ans[i++] = neg.get(n++);
        }
        while(p < pos.size()) ans[i++] = pos.get(p++);
        while(n < neg.size()) ans[i++] = neg.get(n++);
        return ans;
     }

}