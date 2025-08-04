//Link:https://leetcode.com/problems/reverse-string-ii/
//tc:O(n)
//sc: O(1)
//Status: Solved ✅ | Date: 2025-08-4

class ReverseStringII{
    public String reverseStr(String s, int k) {
        char[] word = s.toCharArray();
        for(int i=0; i<word.length; i+=2*k){
            int left = i;
            int right = Math.min(i+k-1, word.length-1);
            while(left < right){
                char temp = word[left];
                word[left] = word[right];
                word[right] = temp;
                left++;
                right--;
            }
        }
        return new String(word);
    }
}