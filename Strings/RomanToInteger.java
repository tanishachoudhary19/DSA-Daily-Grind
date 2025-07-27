class RomanToInteger{
     public int romanToInt(String s) {
        int num = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
           if(i+1 < s.length()){
            char next = s.charAt(i+1);
            if(c == 'I' && (next == 'V' || next == 'X')){
                num -= 1;
                continue;
            }
            if(c == 'X' && (next == 'L' || next == 'C')){
                num -= 10;
                continue;
            }
            if(c == 'C' && (next == 'D' || next == 'M')){
                num -= 100;
                continue;
            }
           }
           if(c == 'I') num += 1;
           if(c == 'V') num += 5;
           if(c == 'X') num += 10;
           if(c == 'L') num += 50;
           if(c == 'C') num += 100;
           if(c == 'D') num += 500;
           if(c == 'M') num += 1000;
        }
        return num;
    }
}