package Arrays;

import java.util.ArrayList;

public class ArrayListAddRemove {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println(arr + " " + arr.size());
        arr.add(10);
        System.out.println(arr + " " + arr.size());
        arr.add(20);
        System.out.println(arr + " " + arr.size());
        arr.add(-45);
        System.out.println(arr + " " + arr.size());
        arr.add(287);
        System.out.println(arr + " " + arr.size());

        arr.remove(2);
        System.out.println(arr + " " + arr.size());
    }
}
