//Link:https://www.geeksforgeeks.org/problems/count-subarray-with-given-xor/1
//tc:O(n)
//sc:O(n)
//Status: Solved ✅ | Date: 2025-07-21

import java.util.*;
class countSubarrWithXOR{
    public long subarrayXor(int arr[], int k) {
        // code here
        HashMap<Integer,Integer> hmap = new HashMap<>();
        hmap.put(0,1);
        int xr = 0;
        int x = 0;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            xr = xr^arr[i];
            x = xr^k;
            if(hmap.containsKey(x)){
                count += hmap.get(x);
            }
            hmap.put(xr,hmap.getOrDefault(xr,0)+1);
        }
        return count;
    }
}