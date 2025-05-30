package HashMaps;

import java.util.HashMap;

public class Map_Basics_2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Sohel", 95);
        map.put("Souptika", 96);
        map.put("Khushboo", 97);
        map.put("Ragini", 98);
        map.put("Arpita", 96);
        //printing (key,value) pairs:
        for(String key : map.keySet()){
            int val = map.get(key);
            System.out.println(key+" "+val);
        }
        System.out.println();
        //printing only keys:
        for(String key : map.keySet()){
            System.out.println(key);
        }
        System.out.println();
        //printing only values:
        for(int val : map.values()){
            System.out.println(val);
        }
        System.out.println();
        //printing (key,value) pairs-II:
        for(Object pair : map.entrySet()){
            System.out.println(pair);
        }
    } //generally we use HashMaps when occurrence of elements to be determined.
}
