//Link:https://www.geeksforgeeks.org/problems/permutations-of-a-given-string2041/1
//tc:O(N.N!)
//sc:O(N.N!)
// Status: Solved ✅ | Date: 2025-08-10

import java.util.*;
class permutationsOfString{
        private void helper(String s, String output,ArrayList<String> ans,HashSet<String> hset){
        if(s.length() == 0){
            if(!hset.contains(output)){
                ans.add(output);
                hset.add(output);
            }
            return;
        }
        for(int i=0; i<s.length(); i++){
            String newinput = s.substring(0,i)+s.substring(i+1);
            String newoutput = output+s.charAt(i);
            helper(newinput,newoutput,ans,hset);
        }
    }
    public ArrayList<String> findPermutation(String s) {
        // Code here
        ArrayList<String> ans = new ArrayList<>();
        HashSet<String> hset = new HashSet<>();
        helper(s,"",ans,hset);
        return ans;
    }
}