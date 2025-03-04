package Searching;

public class Rotated_Array {
    static int search(int[] arr, int target) {
        int n=arr.length;
        int lo=0, hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>arr[n-1]){ //mid is in left sorted array
                if(arr[lo]<=target && target<=arr[mid]) hi=mid-1;
                else lo=mid+1;
            }
            else if(arr[mid]<=arr[n-1]){ //mid is in right sorted array
                if(arr[mid]<=target && target<=arr[hi]) lo=mid+1;
                else hi=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5};
        int target = 5;
        System.out.println(search(arr, target));
    }
}
