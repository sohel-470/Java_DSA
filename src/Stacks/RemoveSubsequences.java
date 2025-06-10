package Stacks;

import java.util.ArrayList;
import java.util.Stack;

//Remove all the consecutive sub-sequences of length>=2 that contains the same element.
public class RemoveSubsequences {
    static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static int[] twoPointers(int[] arr){
        ArrayList<Integer> brr = new ArrayList<>();
        int n = arr.length;
        int i=0, j=0, count=0;
        while(j<n){
            if(arr[j]==arr[i]){
                count++;
                j++;
            }
            else{ //arr[j]!=arr[i]
                if(count==1) brr.add(arr[i]);
                i=j;
                count=0;
            }
        }
        if(count==1) brr.add(arr[i]);
        int[] ans = new int[brr.size()];
        int k=0;
        for(int ele:brr) ans[k++] = ele;
        return ans;
    }
    static int[] usingStack(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length, i=1;
        st.push(arr[0]);
        while(i<n){
            if(arr[i]!=st.peek()) st.push(arr[i++]);
            else { //arr[i]==st.peek();
                while(i<n && arr[i]==st.peek()) i++;
                st.pop();
            }
        }
        int m = st.size();
        int[] ans = new int[m];
        for(int k=m-1; k>=0; k--) ans[k] = st.pop();
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,10,10,10,4,4,4,5,7};
        print(twoPointers(arr));
        print(usingStack(arr));
    }
}
