//Link:https://www.geeksforgeeks.org/problems/permutation-with-spaces3627/1
//tc:O(2^N)
//sc:O(2^N.X)
// Status: Solved ✅ | Date: 2025-08-09

// import java.util.*;
// class permutationwithSpaces{
//     private void helper(int index, String s, String output,ArrayList<String> res){
//         if(index == s.length()){
//             res.add(output);
//             return;
//         }
//         helper(1,s,output+s.charAt(index),res);
//         helper(1,s,output+" "+s.charAt(index),res);
//     }
//     ArrayList<String> permutation(String s){
//         ArrayList<String> res = new ArrayList<>();
//         helper(1,s,""+s.charAt(0),res);
//         Collections.sort(res);
//         return res;
//     }
// }