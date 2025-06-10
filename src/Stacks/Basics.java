package Stacks;

import java.util.Stack;

public class Basics {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1); //TC = O(1)
        st.push(23);
        st.push(90);
        st.push(5);
        System.out.println(st.peek()); //only returns the last element but won't remove it. TC = O(1)
        System.out.println(st); //prints the whole stack in order
        System.out.println(st.pop()); //returns and removes the last element. TC = O(1)
        st.pop();
        System.out.println(st);
        System.out.println("Size is: "+ st.size());

        st.push(90);
        st.push(5);
        st.push(34);
        System.out.println(st);
        //now to print the second element(=23)
        while(st.size()>2) st.pop();
        System.out.println(st.peek()); //now 23 is the top-most element
        System.out.println(st); //but the remaining elements got deleted from stack!
        System.out.println(st.isEmpty()); //returns boolean check for size==0
    }
}
