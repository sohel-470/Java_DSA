package Searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class K_closest_Elements {
    static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> brr = new ArrayList<>(k);
        int n=arr.length;
        int lo=0, hi=n-1, lb=n;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>=x) {lb=mid; hi=mid-1;}
            else lo=mid+1;
        }
        System.out.println(lb);
        int i=lb, j=lb+1, z=0;
        while(z<k){
            if(Math.abs(arr[i]-x)<Math.abs(arr[j]-x)){
                brr.add(arr[i]);
                if(i>0){
                    i--;
                }
                else j++;
            }
            else if(Math.abs(arr[i]-x)>Math.abs(arr[j]-x)){
                brr.add(arr[j]);
                if(j<n-1){
                    j++;
                }
                else i--;
            }
            else if(Math.abs(arr[i]-x)==Math.abs(arr[j]-x)){
                brr.add(arr[i]);
                if(i>0){
                    i--;
                }
                else j++;
            }
            z++;
        }
        Collections.sort(brr);
        return brr;
    }
    public static void main(String[] args) {
        int[] arr = {-2,-1,1,2,3,4,5};
        int x=3, k=7;
        System.out.println(findClosestElements(arr, k, x));
    }
}
