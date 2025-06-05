package Prefix_Sum;
import java.util.*;

public class basics {
    static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {7,3,2,4};
        int n = arr.length;
        //Creating prefix sum array using extra space
        int[] pre = new int[n];
        pre[0] = arr[0];
        for(int i=1; i<n; i++){
            pre[i] = arr[i] + pre[i-1];
        }
        print(pre);

        int[] brr = Arrays.copyOf(arr,n);
        //Creating in-place psa
        for(int i=1; i<n; i++){
            brr[i] += brr[i-1];
        }
        print(brr);

        //creating suffix sum array
        int[] suf = new int[n];
        suf[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            suf[i] = arr[i] + suf[i+1];
        }
        print(suf);
    }
}
