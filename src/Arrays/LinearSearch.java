package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target element: ");
        int x = sc.nextInt();

        boolean flag = false;
        for (int i=0; i<n; i++){
            if(arr[i]==x) {
                flag = true;
                break;  // break is used coz after finding element, we don't need to check the whole array
            }
        }
        if(flag==true) System.out.println("Element found !");
        else System.out.println("Element not found !");
    }
}
