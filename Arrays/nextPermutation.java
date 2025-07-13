//Link:https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
//tc:O(n)
//sc:O(1)
//Status: Solved ✅ | Date: 2025-07-13

class nextPermutation{
    public void nextPermutation(int[] nums){
        int n = nums.length;
        int low = -1;
        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]) {
                low = i;
                break;
            }
        }
        int high = -1;
        for(int j=n-1; j>low; j--){
            if(nums[j] > nums[low]){
                high = j;
                break;
            }
        }
        if(low == -1){
            reverse(nums,0,n-1);
            return;
        }
        swap(nums,low,high);
        reverse(nums,low+1,n-1);
    }
    private void swap(int[]nums, int low, int high){
       int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp; 
    }
    private void reverse(int[] nums, int s, int e){
        while (s < e){
            int temp = nums[s];
            nums[s++] = nums[e];
            nums[e--] = temp;
        }
}
}