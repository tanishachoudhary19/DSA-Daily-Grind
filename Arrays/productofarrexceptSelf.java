//Link:
//TC:O(N)
//SC:O(N)
// Status: Solved ✅ | Date: 2025-06-01

class productofarrexceptSelf{
    public int[] productExcept(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = 1;
        suffix[n-1] = 1;
        for(int i=1; i<n; i++){
            prefix[i] = nums[i-1]*prefix[i-1];
        }
        for(int i=n-2; i>=0; i--){
            suffix[i] = nums[i+1]*suffix[i+1];
        }
        for(int i=0; i<n; i++){
            res[i] = prefix[i]*suffix[i];
        }
        return res;
    }
}