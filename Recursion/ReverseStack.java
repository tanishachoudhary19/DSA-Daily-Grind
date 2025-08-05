//Link:https://www.geeksforgeeks.org/problems/reverse-a-stack/1
//tc:O(n2)
//sc: O(n)
//Status: Solved ✅ | Date: 2025-08-5

import java.util.Stack;
class ReverseStack{
    static void insert(Stack<Integer> st, int temp){
        if(st.isEmpty()){
            st.push(temp);
            return;
        }
        int top = st.pop();
        insert(st,temp);
        st.push(top);
    }
    static void reverse(Stack<Integer> st){
        if(st.isEmpty()) return;
        int temp = st.peek();
        st.pop();
        reverse(st);
        insert(st,temp);
    }
}