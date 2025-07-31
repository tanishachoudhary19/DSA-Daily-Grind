//Link:https://leetcode.com/problems/string-to-integer-atoi/
//tc:O(n)
//sc: O(1)
//Status: Solved ✅ | Date: 2025-07-31

class StringToInteger{
     public int myAtoi(String s) {
        s = s.trim();
        if(s.isEmpty()) return 0;
        int i=0, sign = 1, result = 0;
        if(s.charAt(i) == '-' || s.charAt(i) == '+'){
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        while(i < s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            if(result > (Integer.MAX_VALUE - digit)/10){
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result*10+digit;
            i++;
        }
        return result*sign;
    }
}