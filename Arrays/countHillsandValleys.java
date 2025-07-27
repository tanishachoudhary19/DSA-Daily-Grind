//Link:https://leetcode.com/problems/count-hills-and-valleys-in-an-array/
//tc:O(n )
//sc:O(n)
//Status: Solved ✅ | Date: 2025-07-27

import java.util.ArrayList;
class countHillsandValleys{
    public int countHillValley(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            list.add(nums[i]);
        }
        int count = 0;
        for(int i = 1; i<list.size()- 1; i++){
            if((list.get(i) > list.get(i-1) && list.get(i) > list.get(i+1))|| (list.get(i) < list.get(i-1) && list.get(i) < list.get(i+1))) count++;
        }
        return count;
    }    
}