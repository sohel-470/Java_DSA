package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,15,21,34,81,105,180,500};  //sorted array
        int n = arr.length;
        int target = 22;
        boolean flag=false;
        int lo=0, hi=n-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;   //mid = lo + (hi-lo)/2;
            if(arr[mid]<target) lo=mid+1;
            else if(arr[mid]>target) hi=mid-1;
            else if(arr[mid]==target){
                flag=true; break;
            }
        }
        if(flag==true) System.out.println("Element found!");
        else System.out.println("Element not found!");
    }
}
