package Searching;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {10,20,30,30,40,50,60,70};
        int n = arr.length, x=71;  //x=target
        int lo=0, hi=n-1, lb=n;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>=x){  //for upperBound, just replace this condition as: if(arr[mid]>x)
                lb=Math.min(lb,mid);
                hi=mid-1;
            }
            else lo=mid+1;
        }

        System.out.println(lb);
    }
}
