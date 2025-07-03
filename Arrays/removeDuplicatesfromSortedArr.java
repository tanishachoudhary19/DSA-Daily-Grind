//Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
//Tc : O(N)
// Sc : O(1)
// Status: Solved ✅ | Date: 2025-07-03

class removeDuplicatesfromSortedArr{
    public int removeDuplicates(int[] nums){
        int i = 0;
        for(int j = 1; j<nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}