//Link:https://leetcode.com/problems/sort-array-by-increasing-frequency/
//tc:O(n logn)
//sc:O(n)
//Status: Solved ✅ | Date: 2025-07-26

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
class SortArrbyIncFreq{
     public int[] frequencySort(int[] nums){
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int num : nums) hmap.put(num,hmap.getOrDefault(num,0)+1);
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums)list.add(num);
        Collections.sort(list,(a,b)->{
            int freqa = hmap.get(a);
            int freqb = hmap.get(b);
            if(freqa != freqb){
                return freqa-freqb;
            }else{
                return b-a;
            }
        });
int[] res = new int[list.size()];
for(int i=0; i<res.length; i++){
    res[i] = list.get(i);
}
return res;
     }
    
}