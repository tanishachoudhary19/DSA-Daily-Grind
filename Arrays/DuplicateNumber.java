//link:https://leetcode.com/problems/find-the-duplicate-number/
//Tc: O(NLOGN);
//SC: O(1);
// Status: Solved ✅ | Date: 2025-06-17

import java.util.*;
class DuplicateNumber{
    public int findDuplicate(int[] nums){
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]) return nums[i];
        }
        return -1;
    }   
}