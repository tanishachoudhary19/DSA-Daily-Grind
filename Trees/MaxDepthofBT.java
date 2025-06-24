//link:https://leetcode.com/problems/maximum-depth-of-binary-tree/
//TC : O(N)
//SC: O(N)
// Status: Solved ✅ | Date: 2025-06-24

// class MaxDepthofBT{
//     public int maxDepth(TreeNode root) {
//         if(root == null) return 0;
//         int leftheight = maxDepth(root.left);
//         int rightheight = maxDepth(root.right);
//         int depth = 1+Math.max(leftheight, rightheight);
//         return depth;
//     }
// }