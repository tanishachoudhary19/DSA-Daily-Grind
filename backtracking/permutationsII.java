//Link:https://leetcode.com/problems/permutations-ii/
//tc:O(N.N!)
//sc:O(N.N!)
// Status: Solved ✅ | Date: 2025-08-10

import java.util.*;
class permutationsII{
     private void helper(int[]nums,List<Integer> curr,List<List<Integer>> ans,HashSet<List<Integer>> hset){
        if(nums.length == 0){
            if(!hset.contains(curr)){
                ans.add(new ArrayList<>(curr));
                hset.add(new ArrayList<>(curr));
            }
            return;
        }
        for(int i=0; i<nums.length; i++){
            curr.add(nums[i]);
            int k=0;
            int[] newnums = new int[nums.length-1];
            for(int j=0; j<nums.length; j++){
                if(i!=j){
                    newnums[k++] = nums[j];
                }
            }
            helper(newnums,curr,ans,hset);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        HashSet<List<Integer>> hset = new HashSet<>();
        helper(nums,curr,ans,hset);
        return ans;
    }
}