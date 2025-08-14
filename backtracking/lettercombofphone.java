//link:https://leetcode.com/problems/letter-combinations-of-a-phone-number/
//TC:O(4^n)
//SC:O(4^n)
// Status: Solved ✅ | Date: 2025-08-13

// class lettercombofphone{
//     private void helper(int index, String digits, StringBuilder curr, HashMap<Character,String> hmap, List<String> ans){
//         if(index == digits.length()){
//            ans.add(curr.toString());
//            return;
//         }
//         char ch = digits.charAt(index);
//         String letters = hmap.get(ch);
//         for(char c : letters.toCharArray()){
//             curr.append(c);
//             helper(index+1,digits,curr,hmap,ans);
//             curr.deleteCharAt(curr.length()-1);
//         }
//     }
//     public List<String> letterCombinations(String digits) {
//         List<String> ans = new ArrayList<>();
//         if(digits.isEmpty()) return ans;
//         StringBuilder curr = new StringBuilder();
//         HashMap<Character,String> hmap  = new HashMap<>();
//         hmap.put('2', "abc");
//         hmap.put('3', "def");
//         hmap.put('4', "ghi");
//         hmap.put('5', "jkl");
//         hmap.put('6', "mno");
//         hmap.put('7', "pqrs");
//         hmap.put('8', "tuv");
//         hmap.put('9', "wxyz");
//         helper(0,digits,curr, hmap,ans);
//         return ans;
//     }
// }