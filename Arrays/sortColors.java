//Link:https://leetcode.com/problems/sort-colors/
//Tc : O(N)
// Sc : O(1)
// Status: Solved ✅ | Date: 2025-07-07

class sortColors{
public void sortcolors(int[] nums){
    int low = 0;
    int mid = 0;
    int high = nums.length-1;
    while(mid <= high){
        if(nums[mid] == 0){
            int temp = nums[low];
            nums[low] = nums[mid];
            nums[mid] = temp;
            low++;
            mid++;
        }else if(nums[mid] == 1){
            mid++;
        }else{
            int temp = nums[high];
            nums[high] = nums[mid];
            nums[mid] = temp;
            high--;
        }
    }
}
}