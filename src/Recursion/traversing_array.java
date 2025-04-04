package Recursion;

public class traversing_array {
    public static void print(int i, int[] arr){
        if(i== arr.length) return;
        System.out.print(arr[i]+" ");
        print(i+1,arr);
    }
    public static void main(String[] args) {
        int[] arr = {4,7,1,3,8,6,9,5};
        print(0,arr);
    }
}
