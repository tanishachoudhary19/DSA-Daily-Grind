//Link:https://www.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1
//tc:O(n)
//sc:O(n)
//Status: Solved ✅ | Date: 2025-07-20

import java.util.*;
class largestSubarrwith0Sum{
    int maxLength(int arr[]) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int sum = 0;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum != 0){
                if(hmap.containsKey(sum)){
                    
                   count = Math.max(count,i-hmap.get(sum));
                }else{
                    hmap.put(sum,i);
                }
            }else{
                 count = Math.max(count,i+1);
            }
        }
        return count;
    }
}