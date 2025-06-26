//link:https://leetcode.com/problems/search-in-a-binary-search-tree/
//TC:O(H)
//SC:O(H)
// Status: Solved ✅ | Date: 2025-06-26

// class searchinBST{
//         public TreeNode searchBST(TreeNode root, int val) {
//         if(root == null) return null;
//         if(root.val == val) return root;
//         TreeNode res = root;
//         if(root.val > val){
//            res = searchBST(root.left, val);
//         }else{
//            res = searchBST(root.right, val);
//         }
//         return res;
//     }
// }