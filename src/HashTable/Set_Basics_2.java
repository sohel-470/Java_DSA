package HashTable;

import java.util.HashSet;

public class Set_Basics_2 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        set.add(200);
        System.out.println(set);
        set.add(100); //HashSet can't contain duplicate elements i.e. occurrence of each element=1
        System.out.println(set);
    }

}
