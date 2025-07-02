//link:https://leetcode.com/problems/rotate-array/
//tc : O(n)
//sc : O(1)
// Status: Solved ✅ | Date: 2025-07-02

class RotateArr{
    public void rotate(int []nums, int startIndex, int endIndex){
        int left = startIndex;
        int right = endIndex;
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right]  = temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k){
        int n = nums.length;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k , n-1);
    }
}