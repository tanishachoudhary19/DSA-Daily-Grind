//Link:https://leetcode.com/problems/largest-odd-number-in-string/
//tc:O(n)
//sc:O(1)
//Status: Solved ✅ | Date: 2025-07-28

class LargestoddString{
      public String largestOddNumber(String num) {
        if((num.charAt(num.length()-1) - '0') % 2 != 0) return num;
        for(int i=num.length()-1; i>=0; i--){
            if((num.charAt(i) - '0') % 2 != 0) return num.substring(0,i+1);
        }
        return "";
    }
}