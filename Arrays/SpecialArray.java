//Link:https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
//tc:O(n logn)
//sc:O(1)
//Status: Solved ✅ | Date: 2025-07-26

class SpecialArray{
    public int specialArray(int[] nums){
        int left = 0;
        int right = nums.length;
        while(left <= right){
            int mid = left + (right-left)/2;
            int count = 0;
            for(int num : nums){
                if(num >= mid) count++;
            }
            if(count == mid) return mid;
            else if(count > mid) left = mid+1;
            else right = mid-1;
        }
        return -1;
    }
}