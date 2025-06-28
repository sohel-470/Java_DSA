package Stacks;

import java.util.Stack;

public class NextGreaterElement {
    static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static int[] bruteForce(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(arr[j]>arr[i]){
                    arr[i] = arr[j];
                    break;
                }
                if(j==n-1) arr[i] = -1;
            }
        }
        return arr;
    }
    static int[] usingStack(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        st.push(arr[n-1]);
        arr[n-1] = -1; //last element is always = -1
        for(int i=n-2; i>=0; i--){
            if(arr[i]<st.peek()){
                int top = st.peek();
                st.push(arr[i]);
                arr[i] = top;
            }
            else if(arr[i]>=st.peek()){
                while(st.size()>0 && arr[i]>=st.peek()) st.pop();
                if(st.isEmpty()){
                    st.push(arr[i]);
                    arr[i] = -1;
                }
                else if(arr[i]<st.peek()){
                    int top = st.peek();
                    st.push(arr[i]);
                    arr[i] = top;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,3,2,1,6,3,4};
        //print(bruteForce(arr));
        print(usingStack(arr));
    }
}
