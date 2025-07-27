//Link:https://leetcode.com/problems/remove-outermost-parentheses/
//tc:O(n)
//sc:O(n)
//Status: Solved ✅ | Date: 2025-07-26
class RemoveOutermostParentheses{
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int count = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                if(count > 0) res.append(c);
                count++;
            }else{
                count--;
                if(count > 0) res.append(c);
            }
        }
        return res.toString();
    }
}