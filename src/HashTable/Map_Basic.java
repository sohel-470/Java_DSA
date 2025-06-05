package HashTable;

import java.util.HashMap;

public class Map_Basic {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Sohel", 95); // to insert (key,value) pair.
        map.put("Souptika", 96);
        map.put("Khushboo", 94);
        map.put("Ragini", 95);
        map.put("Arpita", 96);
        System.out.println(map+" "+map.size());
        System.out.println(map.containsKey("Souptika"));
        System.out.println(map.containsValue(97));
        //Keys are unique, value can repeat!
        map.put("Sohel", 100); //value gets updated but won't copy.
        System.out.println(map+" "+map.size());
        map.remove("Sohel"); //removes the (key,value) pair.
        map.remove("Argha"); //No error even if the key is not present.
        System.out.println(map+" "+map.size());
        System.out.println(map.get("Arpita")); //returns value of the key
        System.out.println(map.get("Sohel")); //returns "null" as element not present
        map.clear();
        System.out.println(map);
    }
}