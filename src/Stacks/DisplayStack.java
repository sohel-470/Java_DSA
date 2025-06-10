package Stacks;

import java.util.Stack;

public class DisplayStack {
    static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);st.push(2);st.push(3);st.push(4);st.push(5);
        System.out.println(st+" st");

        int[] arr = new int[st.size()];//we can also use another stack rt for this purpose
        while(st.size()>0) arr[st.size()-1] = st.pop();
        System.out.println(st+" st");

        for(int ele:arr){
            System.out.print(ele+" ");
            st.push(ele);
        }
        System.out.println();
        System.out.println(st+" st");
    }
}
