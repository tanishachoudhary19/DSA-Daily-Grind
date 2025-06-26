//Link: https://leetcode.com/problems/diameter-of-binary-tree/
//TC: O(n)
//SC : o(h)
// Status: Solved ✅ | Date: 2025-06-26

// class diameter{
//      int diameter = 0;
//     public int depth(TreeNode root){
//         if(root == null) return 0;
//         int leftD = depth(root.left);
//         int rightD = depth(root.right);
//         diameter = Math.max(diameter, leftD+rightD);
//         return 1+Math.max(leftD,rightD);
//     }
//     public int diameterOfBinaryTree(TreeNode root) {
//        depth(root);
//        return diameter;
//     }
// }