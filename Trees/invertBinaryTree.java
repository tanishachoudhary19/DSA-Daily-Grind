//link:https://leetcode.com/problems/invert-binary-tree/
//TC : O(N)
//SC: O(N)
// Status: Solved ✅ | Date: 2025-06-24

// class invertBinaryTree{
//     public TreeNode invertTree(TreeNode root) {
//        if(root == null) return root;
//        TreeNode temp = root.left;
//        root.left = root.right;
//        root.right = temp;

//        invertTree(root.left);
//        invertTree(root.right);

//        return root;
//     }
// }