package Stacks;

import java.util.Stack;

public class ReversingAStack {
    static void reverseUsingStack(Stack<Integer> st){
        Stack<Integer> gt = new Stack<>();
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0) gt.push(st.pop());
        while(gt.size()>0) rt.push(gt.pop());
        while(rt.size()>0) st.push(rt.pop());
    }
    static void pushAtBottom(Stack<Integer> st, int x){
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0) rt.push(st.pop());
        st.push(x);
        while(rt.size()>0) st.push(rt.pop());
    }
    static void reverseUsingRecursion(Stack<Integer> st){
        if(st.size()==1) return;
        int top = st.pop();
        reverseUsingRecursion(st);
        pushAtBottom(st,top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);st.push(2);st.push(3);st.push(4);st.push(5);
        System.out.println(st+" st");

//        reverseUsingStack(st);
//        System.out.println(st+" st");

        reverseUsingRecursion(st);
        System.out.println(st+" st");
    }
}
