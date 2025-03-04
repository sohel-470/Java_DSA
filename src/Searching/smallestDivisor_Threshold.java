package Searching;

public class smallestDivisor_Threshold {
    static int smallestDivisor(int[] arr, int t) {
        int n=arr.length, d=1, max=Integer.MIN_VALUE;
        //finding max element in array
        for(int i=0; i<n; i++){
            if(arr[i]>max) max=Math.max(max,arr[i]);
        }
        int lo=1, hi=max;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            int sum=0;
            //calculating sum using 'd(=mid)' as divisor
            for(int i=0; i<n; i++){
                if(arr[i]%mid==0) sum+=arr[i]/mid;
                else sum+=(arr[i]/mid)+1;
            }
            if(sum<=t){
                d=mid;
                hi=mid-1; //checking for other possibilities of 'd'
            }
            else lo=mid+1;
        }
        return d;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,9};
        int t = 6;
        System.out.println(smallestDivisor(arr,t));
    }
}
