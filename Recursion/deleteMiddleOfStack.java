//Link:https://www.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1
//tc:O(n)
//sc: O(n)
//Status: Solved ✅ | Date: 2025-08-5

class deleteMiddleOfStack{
     private void solve(Stack<Integer> s, int k){
        if(k == 1){
            s.pop();
            return;
        }
        int temp = s.peek();
        s.pop();
        solve(s,k-1);
        s.push(temp);
    }
    public void deleteMid(Stack<Integer> s) {
        // code here
        if(s.isEmpty()) return;
        int n = s.size();
        int k = (n/2)+1;
        solve(s,k);
    }
}