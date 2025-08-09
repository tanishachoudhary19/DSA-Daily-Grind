//Link:https://www.geeksforgeeks.org/problems/subsets-1587115621/1
//tc:O(2^N)
//sc:O(2^N.X)
// Status: Solved ✅ | Date: 2025-08-09

import java.util.*;
class uniqueSubsets{
    private static void helper(int index, int[] arr, ArrayList<Integer> curr ,ArrayList<ArrayList<Integer>> ans,HashSet<ArrayList> hset){
        if(index == arr.length){
            if(!hset.contains(curr)){
                ans.add(new ArrayList<>(curr));
                hset.add(curr);
                return;
            }else return;
        }
        curr.add(arr[index]);
        helper(index+1,arr,curr,ans,hset);
        curr.remove(curr.size()-1);
        helper(index+1,arr,curr,ans,hset);
    }
    public static ArrayList<ArrayList<Integer>> AllSubsets(int arr[], int n) {
        // your code here
        Arrays.sort(arr);
        HashSet<ArrayList> hset = new HashSet<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        helper(0,arr,curr,ans,hset);
        Collections.sort(ans,(a,b)->{
            int size = Math.min(a.size(), b.size());
            for(int i=0; i<size; i++){
                if(!a.get(i).equals(b.get(i))){
                    return a.get(i)-b.get(i);
                }
            }
            return a.size()-b.size();
        });
        return ans;
    }
}