//link:https://leetcode.com/problems/median-of-two-sorted-arrays/
//TC:O((n+m)log(n+m))
//SC: O(N+M);
// Status: Solved ✅ | Date: 2025-06-16

import java.util.*;
class MedianofTwoArrays{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        int[] merged = new int[len1 + len2];
        System.arraycopy(nums1, 0, merged, 0, len1);
        System.arraycopy(nums2, 0, merged, len1, len2);
        Arrays.sort(merged);
        
        int totalLen = merged.length;
        if (totalLen % 2 == 0) {
            return (merged[totalLen / 2 - 1] + merged[totalLen / 2]) / 2.0;
        } else {
            return merged[totalLen / 2];
        }
    }
}