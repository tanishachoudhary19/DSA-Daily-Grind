//Link:https://www.geeksforgeeks.org/problems/sum-of-subarrays2229/1
//tc:O(n)
//sc:O(1)
//Status: Solved ✅ | Date: 2025-07-23

class sumofSubarrays{
    public int subarraySum(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i]*(i+1)*(n-i);
        }
        return sum;
    }
}