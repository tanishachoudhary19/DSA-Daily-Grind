//Leetcode Contest question
//TC: O(n + k * √f_max)
//SC: O(k)
// Status: Solved ✅ | Date: 2025-06-22

import java.util.HashMap;
import java.util.HashSet;

class checkIfAnyElementHasPrimeFreq{
    public boolean isPrime(int freq){
        if(freq <= 1) return false;
        for(int i=2; i<=Math.sqrt(freq); i++){
            if(freq % i == 0) return false;
        }
        return true;
    }
    public boolean checkPrimeFrequency(int[] nums){
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            hmap.put(nums[i], hmap.getOrDefault(nums[i],0)+1);
        }
        HashSet<Integer> hset = new HashSet<>();
        for(int freq : hmap.values()){
            if(hset.contains(freq)) continue;
            else hset.add(freq);
            if(isPrime(freq)) return true;
        }
        return false;
    }
}