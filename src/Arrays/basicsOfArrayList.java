package Arrays;

import java.util.ArrayList;

public class basicsOfArrayList {
    public static void main(String[] args) {
//        int[] arr = new int[6];
//        double brr[] = {3.14, 2.67,5.98};
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0,10);  // same as arr[0] = 10
        arr.add(1,20);  // initialise
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        System.out.println(arr.size());
        System.out.println(arr);  // built-in function for printing arraylist

//        printing using loop
        for(int i=0; i<arr.size(); i++){  // use arr.size() instead of arr.length
            System.out.print(arr.get(i) + " ");  // use arr.get[i] instead of arr[i] for printing
        }
        System.out.println();

        arr.set(2, 3000);  // modify an element
        System.out.println(arr);

//        Adding extra element to the arraylist
        arr.add(90);  //push back-- ADDING AT LAST --> size of arr increases
        System.out.println(arr.size());
        System.out.println(arr);
    }
}
