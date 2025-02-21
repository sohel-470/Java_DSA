package Arrays;

import java.util.Arrays;

public class BuitlInMethods {
    public static void main(String[] args) {
        int[] arr = {40,10,70,50,20,30,60};

        //printing an array
        System.out.println("Printing an array(original):");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //for-each loop
        System.out.println("Printing by for-each loop");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();

        //sorting an array
        System.out.println("Sorting & printing an array:");
        Arrays.sort(arr);  //sorts in ascending order
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //copying an array
        //1. Shallow copy
        int nums[] = arr;
        nums[0]= 70;
        System.out.println(arr[0]);

        //2. Deep copy
        int[] brr = Arrays.copyOf(arr, arr.length);
        brr[0]=100;
        System.out.println(arr[0]);
    }
}
