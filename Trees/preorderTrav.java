//link:https://leetcode.com/problems/binary-tree-preorder-traversal/
//Tc: O(N)
//Sc: O(N);
// Status: Solved ✅ | Date: 2025-06-19

// class preorderTrav{
//      public void preorder(TreeNode root, ArrayList<Integer> arr){
//         if(root == null) return;
//         arr.add(root.val);
//         preorder(root.left,arr);
//         preorder(root.right,arr);
//     }

//     public List<Integer> preorderTraversal(TreeNode root) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         preorder(root,arr);
//         return arr;
//     }
// }