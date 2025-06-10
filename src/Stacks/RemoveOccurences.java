package Stacks;

import java.util.ArrayList;
import java.util.Stack;

public class RemoveOccurences {
    static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static int[] twoPointer(int[] arr){
        ArrayList<Integer> brr = new ArrayList<>();
        int n = arr.length;
        int i=0, j=0;
        while(j<n){
            if(arr[j]==arr[i]) j++;
            else{
                brr.add(arr[i]);
                i=j;
            }
        }
        brr.add(arr[i]);
        int[] ans = new int[brr.size()];
        int k=0;
        for(int ele:brr) ans[k++] = ele;
        return ans;
    }
    static int[] usingStack(int[] arr){
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        for(int i=1; i<arr.length; i++) if(st.peek()!=arr[i]) st.push(arr[i]);
        int n = st.size();
        int[] brr = new int[n];
        for(int i=n-1; i>=0; i--) brr[i] = st.pop();
        return brr;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,0,0,0,0};
        print(twoPointer(arr));
        print(usingStack(arr));
    }
}
