package Sorting;

public class checkSorting {
    public static void main(String[] args) {
        int[] arr = {1,1,7,6,10,12};
        boolean flag = true;
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]>arr[i]) {
                flag = false;
                break;
            }
        }
        if(flag==true) System.out.println("Sorted");
        else System.out.println("Unsorted");
    }
}
