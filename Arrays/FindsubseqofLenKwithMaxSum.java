//link:https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum/?envType=daily-question&envId=2025-06-28
//tc : O(n log n)
//sc : O(n)
// Status: Solved ✅ | Date: 2025-06-28

import java.util.*;
class FindsubseqofLenKwithMaxSum{
    public int[] maxSubsequence(int[] nums, int k){
        int[][] pairs = new int[nums.length][2];
        for(int i=0; i<nums.length; i++){
            pairs[i][0] = nums[i];
            pairs[i][1] = i;
        }
        Arrays.sort(pairs, (a,b) -> b[0]-a[0]);
        int[][] topk = Arrays.copyOf(pairs,k);
        Arrays.sort(topk, Comparator.comparingInt(a -> a[1]));
        int[] res = new int[k];
        for(int i=0; i<k; i++){
            res[i] = topk[i][0];
        }
        return res;
    }
}