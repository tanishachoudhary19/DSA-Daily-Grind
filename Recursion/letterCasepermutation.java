//Link:hhttps://leetcode.com/problems/letter-case-permutation/
//tc:O(2^N.N)
//sc:O(2^N.N)
// Status: Solved ✅ | Date: 2025-08-09

// class letterCasepermutation{
//         private void helper(int index, String s, String output, List<String> res){
//         if(index == s.length()){
//             res.add(output);
//             return;
//         }
//         char c = s.charAt(index);
//         if(Character.isDigit(c)){
//             helper(index+1,s,output+c,res);
//         }else{
//             helper(index+1,s,output+Character.toLowerCase(c),res);
//             helper(index+1,s,output+Character.toUpperCase(c),res);
//         }
//     }
//     public List<String> letterCasePermutation(String s) {
//         List<String> res = new ArrayList<>();
//         helper(0,s,"",res);
//         return res;
//     }
// }