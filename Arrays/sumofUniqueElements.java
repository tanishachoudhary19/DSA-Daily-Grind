//Link:https://leetcode.com/problems/sum-of-unique-elements/?envType=problem-list-v2&envId=e8e3ghy5
//tc:o(N)
//sc:O(N)
// Status: Solved ✅ | Date: 2025-08-07

import java.util.HashMap;
class sumofUniqueElements{
     public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int num : nums) hmap.put(num , hmap.getOrDefault(num,0)+1);
        int sum = 0;
        for(int num : hmap.keySet()){
            int count = hmap.get(num);
            if(count == 1) sum += num;
        }
        return sum;
    }
}