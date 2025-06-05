package HashTable;

import java.util.TreeMap;

public class Tree_Map {
    public static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<>();
        map.put("Sohel", 95); // to insert (key,value) pair.
        map.put("Souptika", 96);
        map.put("Khushboo", 94);
        map.put("Ragini", 95);
        map.put("Arpita", 96);
        System.out.println(map);
    }
}
