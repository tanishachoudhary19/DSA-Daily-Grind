//link:https://leetcode.com/problems/maximum-swap/
//TC:O(n^2)
//SC:O(n)
// Status: Solved ✅ | Date: 2025-08-13

class maxSwap{
     public int maximumSwap(int num) {
        String s = String.valueOf(num);
        int k = 1;
        StringBuilder sb = new StringBuilder(s);
        StringBuilder res = new StringBuilder(s);
        helper(0,sb,k,res);
        return Integer.parseInt(res.toString());
    }
    private void helper(int start, StringBuilder sb, int k, StringBuilder res){
        if(k == 0 || start == sb.length()) return;
        int maxIndex = start;
        for(int i=start+1; i<sb.length(); i++){
            if(sb.charAt(i) >= sb.charAt(maxIndex)) maxIndex = i;
        }
        for(int i=start+1; i<sb.length(); i++){
            if(maxIndex != start && sb.charAt(maxIndex) > sb.charAt(start)){
                swap(start,maxIndex,sb);
                if(sb.toString().compareTo(res.toString()) > 0){
                    res.setLength(0);
                    res.append(sb.toString());
                }
                helper(start+1,sb,k-1,res);
            }
            swap(start,maxIndex,sb);
        }
        helper(start+1,sb,k,res);
    }
    private void swap(int i, int j, StringBuilder sb){
        char temp = sb.charAt(i);
        sb.setCharAt(i,sb.charAt(j));
        sb.setCharAt(j,temp);
    }
}