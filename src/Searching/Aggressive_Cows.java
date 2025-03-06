package Searching;

import java.util.Arrays;

public class Aggressive_Cows {
    static boolean isPossible(int[] arr, int k, int mid) {
        int cows = 1, last = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] - last) >= mid) {
                cows++;
                last = arr[i];
            }
        }
        if (cows >= k) return true;
        else return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,9};
        int k=3;
        int n=arr.length, dist, ans=0;
        Arrays.sort(arr);
        int lo=1, hi=arr[n-1]-arr[0];
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(isPossible(arr, k, mid)) {ans=mid; lo=mid+1;}
            else hi=mid-1;
        }
        System.out.println(ans);
    }
}
