//Link:https://leetcode.com/problems/subsets-ii/
//tc:o(2^n.n)
//sc:O(2^n.n)
// Status: Solved ✅ | Date: 2025-08-08

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
class subsetsII{
    private void helper(int index, int[] nums, List<Integer> curr, List<List<Integer>> ans){
        if(index == nums.length){
            if(!ans.contains(curr)){
                ans.add(new ArrayList<>(curr));
                return;
            }else return;
        }
            curr.add(nums[index]);
            helper(index+1, nums, curr,ans);
            curr.remove(curr.size()-1);
            helper(index+1, nums, curr, ans);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(0,nums,curr,ans);
        return ans;
    }
}