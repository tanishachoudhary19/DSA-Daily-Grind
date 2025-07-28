//Link:https://leetcode.com/problems/reverse-words-in-a-string/
//tc:O(n)
//sc:O(n)
//Status: Solved ✅ | Date: 2025-07-28

class ReverseWordsinString{
     public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        String[] words = s.trim().split("\\s+");
        for(int i=words.length-1; i>=0; i--){
            res.append(words[i]);
            if(i != 0) res.append(" ");
        }
        return res.toString();
    }
}