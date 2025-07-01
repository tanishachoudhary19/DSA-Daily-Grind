//link:https://leetcode.com/problems/subtree-of-another-tree/
//Tc: O(M*N)
//SC : O(M)
// Status: Solved ✅ | Date: 2025-07-01

// class subTreeofAnother{
//     public boolean isIdentical(TreeNode root, TreeNode subRoot){
//         if(root == null && subRoot == null) return true;
//         if(root == null || subRoot == null) return false;
//         if(root.val != subRoot.val) return false;
//         return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);

//     }
//     public boolean isSubtree(TreeNode root, TreeNode subRoot) {
//         if(root == null) return false;
//         if(isIdentical(root,subRoot)) return true;
//         return isSubtree(root.left, subRoot) || isSubtree(root.right,subRoot);
//     }
// }