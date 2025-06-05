//Problem : https://leetcode.com/problems/top-k-frequent-elements/description/
//T.C: O(n)
//S.C: O(N)
// Status: Solved ✅ | Date: 2025-06-01

import java.util.*;
class TopKfrequent {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int num : nums){
            hmap.put(num,hmap.getOrDefault(num,0)+1);
        }
        List<Integer>[] buckets = new ArrayList[nums.length+1];
        for(int key : hmap.keySet()){
            int count = hmap.get(key);
            if(buckets[count] == null){
                buckets[count] = new ArrayList<>();
            }
            buckets[count].add(key);
        }
        List<Integer> reslist = new ArrayList<>();
        for(int i=buckets.length-1; i>=0 && reslist.size()<k; i--){
            if(buckets[i] != null){
                for(int num : buckets[i]){
                    reslist.add(num);
                    if(reslist.size()==k) break;
                }
            }
        }
        int[] res = new int[k];
        for(int i=0; i<k; i++){
            res[i] = reslist.get(i);
        }
        return res;
    }
}