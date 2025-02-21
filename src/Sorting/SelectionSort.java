package Sorting;

public class SelectionSort {
    static void swap(int[] axx, int i, int j){
        int temp = axx[i];
        axx[i] = axx[j];
        axx[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {10, -4, 30, 1, 8, -6};
        int  n = arr.length;
        for(int pass=0; pass<n-1; pass++){
            int mindx = -1;
            int min = Integer.MAX_VALUE;
            for(int i=pass; i<n; i++){
                if(arr[i]<min){
                    min = arr[i];
                    mindx = i;
                }
            }
            swap(arr, pass, mindx);
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
