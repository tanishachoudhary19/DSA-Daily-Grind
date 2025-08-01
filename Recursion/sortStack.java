//Link:https://www.geeksforgeeks.org/problems/sort-a-stack/1
//tc:O(n2)
//sc: O(n)
//Status: Solved ✅ | Date: 2025-08-1

import java.util.Stack;
class sortStack{
      void insert(Stack<Integer> s , int temp){
        if(s.isEmpty() || s.peek() < temp){
            s.push(temp);
            return;
        }
        int val = s.pop();
        insert(s,temp);
        s.push(val);
    }
    void sort(Stack<Integer> s, int n){
        if(n <= 1) return;
        int temp = s.pop();
        sort(s,n-1);
        insert(s,temp);
    }
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        sort(s,s.size());
        return s;
    }
}