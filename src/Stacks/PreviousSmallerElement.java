package Stacks;

import java.util.Stack;

public class PreviousSmallerElement {
    static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static int[] usingStack(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        arr[0] = -1;
        for(int i=1; i<n; i++){
            if(st.peek()<arr[i]){
                int top = st.peek();
                st.push(arr[i]);
                arr[i] = top;
            }
            else{
                while(st.size()>0 && st.peek()>=arr[i]) st.pop();
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
        int[] arr = {5,2,4,6,3,5};
        print(usingStack(arr));
    }
}
