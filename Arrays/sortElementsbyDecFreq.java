//Link:https://www.geeksforgeeks.org/problems/sorting-elements-of-an-array-by-frequency-1587115621/1
//tc:O(n logn)
//sc:O(n)
//Status: Solved ✅ | Date: 2025-07-26

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
class sortElementsbyDecFreq{
    public ArrayList<Integer> sortByFreq(int arr[]){
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i : arr)hmap.put(i,hmap.getOrDefault(i, 0)+1);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : arr)list.add(i);
        Collections.sort(list,(a,b)->{
            int freqa = hmap.get(a);
            int freqb = hmap.get(b);
            if(freqa != freqb){
                return freqb - freqa;
            }else{
                return a-b;
            }
        });
        return list;
    }
}