package Stacks;

import java.util.Stack;

public class CopyOrMoveStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> gt = new Stack<>();
        Stack<Integer> rt = new Stack<>();
        int n = 5, i = 1;
        while(i<=n) st.push(i++);
        System.out.println(st+" st");

        //reverse order
        while(st.size()>0) gt.push(st.pop()); //moving contents from st to gt
        System.out.println(gt+" gt");

        //original order
        while(gt.size()>0) rt.push(gt.pop());
        System.out.println(rt+" rt");//in this way we can copy st into rt in the same order using gt

        //now to reverse elements in st(in-place), we take use of gt & rt
        while(rt.size()>0) st.push(rt.pop());
        System.out.println(st+" st");
    }
}
