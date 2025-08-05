//Link:https://leetcode.com/problems/subsets/
//tc:O(2^n)
//sc: O(n)
//Status: Solved ✅ | Date: 2025-08-5

import java.util.*;
class Subsets{
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(0,nums,new ArrayList<>(), res);
        return res;
    }
    private void helper(int index, int[] nums, List<Integer> curr,List<List<Integer>> res){
        if(index == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        helper(index+1, nums,curr,res);
        curr.remove(curr.size()-1);
        helper(index+1, nums,curr,res);
    }
}