package Stacks;

import java.util.Stack;

public class PreviousGreaterElement {
    static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static int[] usingStacks(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        st.push(arr[0]);
        arr[0] = -1;
        for(int i=1; i<n; i++){
            if(st.peek()>arr[i]){
                int top = st.peek();
                st.push(arr[i]);
                arr[i] = top;
            }
            else{
                while(st.size()>0 && st.peek()<=arr[i]) st.pop();
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
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        print(usingStacks(arr));
        //ans = 1, 1, 2, 4, 5, 1
    }
}
