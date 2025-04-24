package Adavanced_Sorting;

public class inversionCount_MergeSort {
    static int count=0;
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
    public static void merge(int[] a, int[] b, int[] c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }
    public static void countInversion(int[] a, int[] b){
        int i=0, j=0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]) {
                count += (a.length-i);
                j++;
            }
            else i++;
        }
    }
    public static void mergeSort(int[] arr){
        int n = arr.length;
        if(n==1) return; //base-case-->Single element array is a sorted array
        //creating new arrays of half-length
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        //copy-paste
        for(int i=0; i<n/2; i++) a[i] = arr[i];
        for(int i=0; i<n/2; i++) b[i] = arr[i+n/2];
        //magic
        mergeSort(a);
        mergeSort(b);
        countInversion(a,b);
        merge(a,b,arr);
    }
    public static void main(String[] args) {
        int[] arr = {8,2,5,3,1,4};
        mergeSort(arr);
        System.out.println(count);
    }
}
