package Arrays;

import java.util.Scanner;

public class MarksNRollNo {
    public static void main(String[] args) {

        int[] arr = {100,56,84,19,34,87,80,56,13,27,30,15,64,27,10,20,33};
        for(int i=0; i<arr.length; i++){
            if(arr[i]<35)
                System.out.println("Roll: " + i + " Marks: " + arr[i]);
        }
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("SUM: "+sum);
    }
}
