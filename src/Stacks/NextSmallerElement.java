package Stacks;

import java.util.Stack;

public class NextSmallerElement {
    static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static int[] usingStack(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        arr[n-1] = -1;
        for(int i=n-2; i>=0; i--){
            if(arr[i]>st.peek()){
                int top = st.peek();
                st.push(arr[i]);
                arr[i] = top;
            }
            else{
                while(st.size()>0 && arr[i]<=st.peek()) st.pop();
                if(st.isEmpty()){
                    st.push(arr[i]);
                    arr[i] = -1;
                }
                else{
                    int top = st.peek();
                    st.push(arr[i]);
                    arr[i] = top;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        print(usingStack(arr));
    }
}
