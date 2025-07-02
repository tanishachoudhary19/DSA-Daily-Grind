//link:https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
//tc: O(n)
//sc: O(1)
// Status: Solved ✅ | Date: 2025-07-02

class checkifArrisrotatedandsorted{
        public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            int next = (i+1) % n; // for comparison of first and last element
            if(nums[i] > nums[next]) count++;
        }
        return count <= 1;
    }
}