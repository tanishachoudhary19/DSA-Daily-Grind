//Link:https://www.geeksforgeeks.org/problems/remove-half-nodes/1
//Tc : O(N)
//SC : O(1)
// Status: Solved ✅ | Date: 2025-07-03

// class removeHalfNodes{
//     public Node RemoveHalfNodes(Node root){
//         if(root == null) return null;
//         root.left = RemoveHalfNodes(root.left);
//         root.right = RemoveHalfNodes(root.right);
//         if(root.left == null && root.right != null) return root.right;
//         if(root.left != null && root.right == null) return root.left;
//         return root;
//     }
// }