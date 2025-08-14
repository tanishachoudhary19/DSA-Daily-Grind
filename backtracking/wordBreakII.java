//link:https://leetcode.com/problems/word-break-ii/
//TC:(O(2^n))
//SC:O(n)
// Status: Solved ✅ | Date: 2025-08-13
import java.util.*;
class wordBreakII{
    public List<String> wordBreak(String s, List<String> wordDict) {
        HashSet<String> hset = new HashSet<>();
        for(String i : wordDict) hset.add(i);
        List<String> curr = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        helper(0,s,hset,curr,ans);
        return ans;   
    }
    private void helper(int index, String s,HashSet<String> hset,List<String> curr,List<String> ans){
        if(index == s.length()){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<curr.size(); j++){
                sb.append(curr.get(j));
                if(j != curr.size()-1) sb.append(" ");
            }
            ans.add(sb.toString());
            return;
        }
        String word = "";
        for(int i=index; i<s.length(); i++){
            word += s.charAt(i);
            if(hset.contains(word)){
                curr.add(word);
                helper(i+1,s,hset,curr,ans);
                curr.remove(curr.size()-1);
            }

        }
    }
}