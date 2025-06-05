package Arrays;

import java.util.Arrays;

public class copyOfArray {
    static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int[] arr = {40,10,70,50,20,30,60};

        //1. Deep copy(Method1)
        int[] brr = Arrays.copyOf(arr, arr.length);
        brr[0]=100;
        print(arr);

        //Deep copy(Method2)
        int[] crr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            crr[i] = arr[i];
        }
        print(crr);

        //2. Shallow copy
        int[] nums = arr;
        nums[0]= 70;
        print(arr);
    }
}
