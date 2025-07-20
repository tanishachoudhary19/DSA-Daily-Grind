//Link:https://leetcode.com/problems/3sum/
//tc:O(n2)
//sc:O(n)
//Status: Solved ✅ | Date: 2025-07-18

import java.util.*;
class FourSum{
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1; j<nums.length-1; j++){
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                int left = j+1;
                int right = nums.length-1;
                while(left < right){
                long sum = (long)nums[i] + (long)nums[j] + (long)nums[left] + (long)nums[right];
                if(sum > target)right--;
                else if(sum < target) left++;
                else{
                    List<Integer> list = Arrays.asList(nums[i],nums[j],nums[left],nums[right]);
                    ans.add(list);
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1]) left++;
                    while(left < right && nums[right] == nums[right+1]) right--;
                    }
                }
            }
        }
        return ans;
    }
}
