//Link:https://leetcode.com/problems/permutations/?envType=problem-list-v2&envId=backtracking
//tc:O(N.N!)
//sc:O(N!)
// Status: Solved ✅ | Date: 2025-08-10

import java.util.*;
class permutationsOfArray{
    private void helper(int[]nums,List<Integer> curr,List<List<Integer>> ans){
        if(nums.length == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0; i<nums.length; i++){
            curr.add(nums[i]);
            int[] newNums = new int[nums.length-1];
            int k=0;
            for(int j=0; j<nums.length;j++){
                if(j!=i){
                    newNums[k++] = nums[j];
                }
            }
            helper(newNums,curr,ans);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(nums,curr,ans);
        return ans;
    }
}