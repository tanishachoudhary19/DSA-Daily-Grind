//Link:https://leetcode.com/problems/3sum/
//tc:O(n2)
//sc:O(n)
//Status: Solved ✅ | Date: 2025-07-18

import java.util.*;
class ThreeSum{
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum > 0) right--;
                else if(sum < 0)left++;
                else{
                    List<Integer> list = Arrays.asList(nums[i],nums[left],nums[right]);
                    ans.add(list);
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1]) left++;
                    while(left < right && nums[right] == nums[right+1]) right--;
                }
            }
        }
        return ans;
    }
}
