//link:https://leetcode.com/problems/insert-into-a-binary-search-tree/
//TC:O(H)
//SC:O(H)
// Status: Solved ✅ | Date: 2025-06-26

// class insertintoBST{
// public TreeNode insertIntoBST(TreeNode root, int val) {
//         if(root == null){
//              TreeNode insert = new TreeNode(val);
//              return insert;
//         }
//         if(root.val > val ){
//             root.left = insertIntoBST(root.left,val);
//         }else{
//             root.right = insertIntoBST(root.right,val);    
//         }
//         return root;
//     }
// }