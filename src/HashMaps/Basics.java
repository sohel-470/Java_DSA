package HashMaps;

import java.util.HashSet;

public class Basics {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //Insert/Remove--> TC = O(1)
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        set.add(200);
        System.out.println(set); //Print: TC=O(n) coz it traverse whole set to print
        set.remove(200);
        System.out.println(set);
        //search/Contains--> true or false: TC = O(1)
        System.out.println(set.contains(11));
        System.out.println("size: " + set.size()); //Size: TC = O(1)
        //converting to array
        System.out.println("printing array");
        Object[] arr = set.toArray();  //use "Object" as data type of array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //HashSets doesn't have concept of indexing, so can't use "for/while-loops", so use "for-each loop"
        System.out.println("printing set");
        for(int ele:set){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println("clearing set");
        //clearing set
        set.clear();
        System.out.println(set);
    }
}
