package Sorting;

public class moveZeroesBubbleSort {
    static void swap(int[] axx, int i, int j){
        int temp = axx[i];
        axx[i] = axx[j];
        axx[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int n = arr.length;
        int noz = 0;
        for(int ele:arr){
            if(ele==0) noz++;
        }
        for(int pass=0; pass<noz; pass++){  //noz passes
            for(int i=0; i<n-1-pass; i++){
                if(arr[i]==0) swap(arr, i, i+1);
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
