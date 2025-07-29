//Link:https://www.geeksforgeeks.org/problems/ascii-range-sum/1
//tc:O(n)
//sc:O(1)
//Status: Solved ✅ | Date: 2025-07-29

import java.util.ArrayList;
import java.util.HashMap;
class ASCIIrangeSum{
     public ArrayList<Integer> asciirange(String s) {
        // code here
        HashMap<Character,Integer> first = new HashMap<>();
        HashMap<Character,Integer> last = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!first.containsKey(c)) first.put(c,i);
            last.put(c,i);
        }
        for(char c : first.keySet()){
            int idx1 = first.get(c);
            int idx2 = last.get(c);
            if(idx1 < idx2){
                int sum = 0;
                for(int i=idx1+1; i<idx2; i++){
                    sum += (int)s.charAt(i);
                }
                if(sum > 0) list.add(sum);
            }
        }
        return list;
}
}