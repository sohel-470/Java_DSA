package Sorting;

public class InsertionSort {
    static void print(int[] axx){
        for(int ele:axx){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void swap(int[] axx, int i, int j){
        int temp = axx[i];
        axx[i] = axx[j];
        axx[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {10, -4, 30, 1, 8, -6};
        int[] brr = {10, -6, 300, 1, 9, -7};
        int n = arr.length;
        int m = brr.length;
//        //inefficient sorting--> no of swaps are more
//        for(int pass=0; pass<n-1; pass++){
//            for(int i=0; i<=pass; i++){
//                if(arr[pass+1]<arr[i]) swap(arr, i, pass+1);
//            }
//        }
        //Format-1 (for-loop)
        for(int pass=0; pass<n-1; pass++){
            for(int i=pass; i>=0 && arr[i+1]<arr[i]; i--){
                swap(arr, i, i+1);
            }
        }
        print(arr);

        //Format-2 (while loop)
        for(int pass=0; pass<m-1; pass++){
            int i=pass;
            while(i>=0 && brr[i+1]<brr[i]){
                swap(brr, i, i+1);
                i--;
            }
        }
        print(brr);
    }
}