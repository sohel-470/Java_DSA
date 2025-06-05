package HashTable;

import java.util.HashMap;

public class Freq_Map_Creation {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = {1,2,3,2,2,1,4,3,3,1,9,9,9,9};
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                int freq = map.get(arr[i]);
                map.put(arr[i],freq+1);
            }
            else map.put(arr[i],1);
        }
        System.out.println(map);
    }
}
