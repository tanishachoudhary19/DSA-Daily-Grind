//Link:https://www.geeksforgeeks.org/problems/string-subsequence-game5515/1
//sc:O(2^n)
// Status: Solved ✅ | Date: 2025-08-08

// import java.util.HashSet;
// import java.util.Set;
// import java.util.TreeSet;
// class strSubseqGame{
// static boolean isVowel(char ch){
//         return "aeiouAEIOU".indexOf(ch) != -1;
//     }
//     static void subsequences(String s, int index, String output, Set<String> hset){
//         if(index == s.length()){
//             if(!output.isEmpty()){
//                 hset.add(output);
//             }
//             return;
//         }
//         subsequences(s,index+1, output + s.charAt(index),hset);
//         subsequences(s,index+1,output,hset);
//     }
//     static TreeSet<String> allPossibleSubsequences(String s) {
//         Set<String> hset = new HashSet<>();
//         TreeSet<String> res = new TreeSet<>();
//         subsequences(s,0,"", hset);
//         for(String str : hset){
//             char start = str.charAt(0);
//             char end = str.charAt(str.length()-1);
//             if(isVowel(start) && !isVowel(end)) res.add(str);
//         }
//         return res;
//     }
// }