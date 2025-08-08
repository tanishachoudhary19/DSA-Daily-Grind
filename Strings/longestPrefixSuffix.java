//Link:https://www.geeksforgeeks.org/problems/longest-prefix-suffix2527/1
//tc:o(n)
//sc:O(n)
// Status: Solved ✅ | Date: 2025-08-08

// class longestPrefixSuffix{
//     int getLPSLength(String s) {
//         // code here
//         int n = s.length();
//         int[] lps = new int[n];
//         lps[0] = 0;
//         int i=1; 
//         int length = 0;
//         while(i < s.length()){
//             if(s.charAt(i) == s.charAt(length)){
//                 length++;
//                 lps[i] = length;
//                 i++;
//             }else{
//                 if(length != 0) length = lps[length-1];
//                 else{
//                     lps[i] = 0;
//                     i++;
//                 }
//             }
//         }
//         return lps[n-1];
//     }
// }