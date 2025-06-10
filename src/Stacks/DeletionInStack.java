package Stacks;

import java.util.Stack;

public class DeletionInStack {
    static void deleteUsingStack(Stack<Integer> st, int idx){
        Stack<Integer> rt = new Stack<>();
        while(st.size()>idx+1) rt.push(st.pop());
        st.pop();
        while(rt.size()>0) st.push(rt.pop());
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int n=5, i=1;
        while(i<=n) st.push(i++);
        System.out.println(st+" st");

        int idx=3;
        deleteUsingStack(st,idx);
        System.out.println(st);
    }
}
