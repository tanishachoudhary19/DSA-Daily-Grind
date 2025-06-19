//Link:https://leetcode.com/problems/squares-of-a-sorted-array/
//Tc: O(N)
//Sc: O(N)
// Status: Solved ✅ | Date: 2025-06-19

class SquaresOfSortedArr{
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int index = n-1;
        int[] arr = new int[n];
        while(left <= right){
            if(nums[left]*nums[left] > nums[right]*nums[right]){
                arr[index] = nums[left]*nums[left];
                left++;
            }else{
                arr[index] = nums[right]*nums[right];
                right--;
            }
            index--;
        }
        return arr;
    }
}