//Link:https://leetcode.com/problems/sort-characters-by-frequency/
//tc:O(n logn)
//sc:O(n)
//Status: Solved ✅ | Date: 2025-07-26

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
class sortcharbyFreq{
     public String frequencySort(String s) {
        char[] str = s.toCharArray();
        HashMap<Character,Integer> hmap = new HashMap<>();
        for(char c : str){
            hmap.put(c,hmap.getOrDefault(c,0)+1);
        }
        ArrayList<Character> list = new ArrayList<>();
        for(char c: str)list.add(c);
        Collections.sort(list,(a,b)->{
            int freqa = hmap.get(a);
            int freqb = hmap.get(b);
            if(freqa != freqb) return freqb - freqa;
            else return a-b;
        });
        StringBuilder res = new StringBuilder();
        for(char  c : list){
            res.append(c);
        }
        return res.toString();
    }
}