//Link:https://leetcode.com/problems/maximum-product-subarray/
//tc:O(n)
//sc:O(n)
//Status: Solved ✅ | Date: 2025-07-21

class MaxProductSubarr{
      public int maxProduct(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int product = 1;
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            product *= nums[i];
            prefix[i] = product;
            ans = Math.max(ans,prefix[i]);
            if(nums[i] == 0) product = 1;
        }
        product = 1;
        for(int i=nums.length-1; i>=0; i--){
            product *= nums[i];
            suffix[i] = product;
            ans = Math.max(ans,suffix[i]);
            if(nums[i] == 0) product = 1;
        }
        return ans;
    }
}