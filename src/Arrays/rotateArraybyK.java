package Arrays;

import java.util.Scanner;
public class rotateArraybyK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50,60,70};
        int n = arr.length;
        System.out.println("Enter no of elements to rotate: ");
        int k = sc.nextInt();
        k = k % n;   // used to reduce unnecessary rotations
        reverse(arr, 0,n-k-1); //reverse the first part
        reverse(arr, n-k, n-1);//reverse the second part(of k elements)
        reverse(arr, 0, n-1);  //reverse the whole array
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void reverse(int[] axx, int i, int j){
        while(i<j){
            int temp = axx[i];
            axx[i] = axx[j];
            axx[j] = temp;
            i++;
            j--;
        }
    }
}
