package Arrays;

import java.util.Arrays;

public class copyOfArray {
    public static void main(String[] args) {

        int[] arr = {40,10,70,50,20,30,60};

        //1. Deep copy(Method1)
        int[] brr = Arrays.copyOf(arr, arr.length);
        brr[0]=100;
        System.out.println(arr[0]);

        //Deep copy(Method2)
        int[] crr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            crr[i] = arr[i];
        }
        for(int ele : crr){
            System.out.print(ele+" ");
        }
        System.out.println();

        //2. Shallow copy
        int [] nums = arr;
        nums[0]= 70;
        System.out.println(arr[0]);
    }
}
