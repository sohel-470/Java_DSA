package Searching;

public class Mountain_Array {
    static int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int lo=1, hi=n-2; //first & last element can't be a peak
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]) return mid;
            else if(arr[mid-1]<arr[mid] && arr[mid]<arr[mid+1]) lo=mid+1;
            else if(arr[mid-1]>arr[mid] && arr[mid]>arr[mid+1]) hi=mid-1;
        }
        return 65688;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,55,30,25,15};
        int peak = peakIndexInMountainArray(arr);
        System.out.println(peak);
    }
}
