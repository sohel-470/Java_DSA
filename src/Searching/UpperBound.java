package Searching;

public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {10,20,30,30,40,50,60,70};
        int n = arr.length, x=10;  //x=target
        int lo=0, hi=n-1, ub=n;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>x){
                ub = Math.min(ub, mid);
                hi=mid-1;
            }
            else lo=mid+1;
        }
        System.out.println(ub);
    }
}
