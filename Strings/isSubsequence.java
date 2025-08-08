//Link:https://leetcode.com/problems/is-subsequence/
//tc:o(N)
//sc:O(1)
// Status: Solved ✅ | Date: 2025-08-08

// class isSubsequence{
//     public boolean isSubsequence(String s, String t) {
//         int i=0,j=0;
//         while(i < s.length() && j < t.length()){
//             char c = s.charAt(i);
//             char ch = t.charAt(j);
//             if(c == ch){
//                 i++;
//                 j++;
//             }else{
//                 j++;
//             }
//         }
//         if(i < s.length()) return false;
//         return true;
//     }
// }