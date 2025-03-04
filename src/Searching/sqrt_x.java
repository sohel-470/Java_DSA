package Searching;

public class sqrt_x {
    static int mySqrt(int x) {
        if(x<=1) return x;
        int lo=0, hi=x;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(mid>x/mid) hi=mid-1;
            else if(mid<x/mid) lo=mid+1;
            else return mid;
        }
        return hi;
    }
    public static void main(String[] args) {
        int x=8;
        System.out.println(mySqrt(x));
    }
}
