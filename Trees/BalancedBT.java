//link:https://leetcode.com/problems/balanced-binary-tree/
//TC:O(n)
//SC:O(n log n)
// Status: Solved ✅ | Date: 2025-06-27

// class BalancedBT{
//         public int depth(TreeNode root){
//         if(root == null) return 0;

//         int leftd = depth(root.left);
//         if(leftd == -1) return -1;

//         int rightd = depth(root.right);
//         if(rightd == -1) return -1;

//         if(Math.abs(leftd-rightd) > 1) return -1;
//         return 1+ Math.max(leftd,rightd);
        
//     }
//     public boolean isBalanced(TreeNode root) {
//        return depth(root) != -1;
//     }
// }