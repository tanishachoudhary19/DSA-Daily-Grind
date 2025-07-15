//Link:https://leetcode.com/problems/valid-word/?envType=daily-question&envId=2025-07-15
//tc:O(n)
//sc:O(1)
//Status: Solved ✅ | Date: 2025-07-15

class word{
      public boolean isValid(String word) {
        if(word.length() < 3) return false;
        int charcount = 0;
        int vowelscount = 0;
        int consonantcount = 0;
        for(char c : word.toCharArray()){
            // if(Character.isLetter(c)) charcount++;
            if(!Character.isLetterOrDigit(c)) return false;
            if(Character.isLetter(c)){
                char ch = Character.toLowerCase(c);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') vowelscount++;
            else consonantcount++;
            }
        }
        return   vowelscount >= 1 && consonantcount >= 1;
    }
}