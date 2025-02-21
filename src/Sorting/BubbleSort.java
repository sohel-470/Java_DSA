package Sorting;

public class BubbleSort {
    static void swap(int[] axx, int i, int j){
        int temp = axx[i];
        axx[i] = axx[j];
        axx[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4};
        int n = arr.length;
//        //Bubble Sort-1(unoptimised)
//        for(int pass=0; pass<n-1; pass++){
//            for (int i=0; i<n-1-pass; i++) {
//                if (arr[i] > arr[i+1]) {
//                    swap(arr, i, i+1);
//                }
//            }
//        }
//        //Bubble Sort-2(little optimised)
//        for(int pass=0; pass<n-1; pass++){
//            for (int i=0; i<n-1-pass; i++) {
//                if (arr[i] > arr[i+1]) {
//                    swap(arr, i, i+1);
//                }
//            }
//        }
        //Bubble Sort-3(optimised)
        for(int pass=0; pass<n-1; pass++){
            boolean flag = true;
            for (int i=0; i<n-1-pass; i++) {  //traversing through array
                if (arr[i] > arr[i+1]) {
                    swap(arr, i, i+1);
                    flag = false;
                }
            }
            if(flag==true) break;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
