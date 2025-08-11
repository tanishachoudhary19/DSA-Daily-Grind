//Link:https://leetcode.com/problems/palindrome-partitioning/
//tc:O(N.N^2)
//sc:O(N.N)
// Status: Solved ✅ | Date: 2025-08-11

class pallindromicPartitioning{
private boolean isPallindromic(String s){
        int start = 0;
        int end = s.length()-1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
    private void helper(int index, String s,List<String> curr,List<List<String>> ans){
        if(index == s.length()){
            ans.add(new ArrayList(curr));
            return;
        }
        for(int i=index; i<s.length(); i++){
            String pal_string = s.substring(index,i+1);
            if(isPallindromic(pal_string)){
                curr.add(pal_string);
                helper(i+1,s,curr,ans);
                curr.remove(curr.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        helper(0,s,curr,ans);
        return ans;
    }
}