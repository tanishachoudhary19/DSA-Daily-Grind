//link:https://leetcode.com/problems/binary-tree-inorder-traversal/
//Tc: O(N)
//Sc: O(N);
// Status: Solved ✅ | Date: 2025-06-19


// class inorderTrav{
//     public void inorder(TreeNode root,ArrayList<Integer> arr){
//         if(root == null) return;
//         inorder(root.left,arr);
//         arr.add(root.val);
//         inorder(root.right,arr);
//     }

//     public List<Integer> inorderTraversal(TreeNode root) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         inorder(root,arr);
//         return arr;
//     }
// }
