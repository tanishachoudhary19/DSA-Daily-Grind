//Link:https://leetcode.com/problems/array-partition/
//TC: O(N LOGN)
//SC: O(1);
// Status: Solved ✅ | Date: 2025-07-12

import java.util.*;
class ArrayPartition{
      public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0; i<nums.length; i+=2){
            sum += nums[i];
        }
        return sum;
    }
}