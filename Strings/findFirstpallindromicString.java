//Link:https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
//Tc : O(N*k)
// Sc : O(1)
// Status: Solved ✅ | Date: 2025-07-09

class findFirstpallindromicString{
    public boolean isPallindrome(String s){
        int left = 0;
        int right = s.length();
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public String firstPalindrome(String[] words){
        for(int i=0; i<words.length; i++){
            if(isPallindrome(words[i])) return words[i];
        }
        return "";
    }
}