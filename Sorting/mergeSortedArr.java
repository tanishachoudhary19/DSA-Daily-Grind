//link:https://leetcode.com/problems/merge-sorted-array/
//TC : O(M+N)
//SC : O(1)
// Status: Solved ✅ | Date: 2025-07-12

// class mergeSortedArr{
//     public void merge(int[] nums1, int m, int[] nums2, int n){
//         int i = m-1;
//         int j = n-1;
//         int k = m+n-1;
//         while(i >= && j>=0){
//             if(nums2[j] > nums1[i]){
//                 nums1[k--] = nums2[j--];
//             }else{
//                 nums1[k--] = nums1[i--];
//             }
//         }
//         while(j >= 0) nums1[k--] = nums2[j--];
//     }
// }