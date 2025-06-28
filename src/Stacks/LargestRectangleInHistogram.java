package Stacks;

import java.util.Stack;

//Leetcode 84
public class LargestRectangleInHistogram {
    static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+"   ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        int[] nse = new int[n];
        nse[n-1] = n;
        st.push(n-1);
        for(int i=n-2; i>=0; i--){
            if(arr[i]>arr[st.peek()]){
                nse[i] = st.peek();
                st.push(i);
            }
            else{
                while(st.size()>0 && arr[i]<=arr[st.peek()]) st.pop();
                if(st.isEmpty()) nse[i] = n;
                else nse[i] = st.peek();
                st.push(i);
            }
        }
        st.clear();

        int[] pse = new int[n];
        pse[0] = -1;
        st.push(0);
        for(int i=1; i<n; i++){
            if(arr[st.peek()]<arr[i]){
                pse[i] = st.peek();
                st.push(i);
            }
            else{
                while(st.size()>0 && arr[st.peek()]>=arr[i]) st.pop();
                if(st.isEmpty()) pse[i] = -1;
                else pse[i] = st.peek();
                st.push(i);
            }
        }
        int area = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            area = Math.max(area,arr[i]*(nse[i]-pse[i]-1));
        }
        System.out.println(area);
        print(nse);
        print(pse);
    }
}