//link:https://leetcode.com/problems/same-tree/
//TC : O(N)
//SC: O(H)
// Status: Solved ✅ | Date: 2025-06-30

// class sameTree{
//         public boolean isSameTree(TreeNode p, TreeNode q) {
//         if(p == null && q == null) return true;
//         if(p == null || q == null) return false;
//         if(p.val != q.val) return false;
//         return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
//     } 
// }