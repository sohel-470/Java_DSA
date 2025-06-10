package Stacks;

import java.util.Stack;

public class insertionInStack {
    static void insertUsingStack(Stack<Integer> st, int x, int idx){
        Stack<Integer> rt = new Stack<>();
        while(st.size()>idx) rt.push(st.pop());
        st.push(x);
        while(rt.size()>0) st.push(rt.pop());
    }
    static void insertUsingRecursion(Stack<Integer> st, int x, int idx){
        if(st.size()==idx){
            st.push(x);
            return;
        }
        int top = st.pop();
        insertUsingRecursion(st,x,idx);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int n=5, i=1;
        while(i<=n) st.push(i++);
        System.out.println(st+" st");

        // now we want to insert num at idx index
        int x = 100, idx = 4;
        insertUsingStack(st,x,idx);
        System.out.println(st);

        insertUsingRecursion(st,x,idx);
        System.out.println(st);
    }
}
