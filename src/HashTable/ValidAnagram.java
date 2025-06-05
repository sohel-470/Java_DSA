package HashTable;
import java.util.*;
public class ValidAnagram {
    public static void main(String[] args) {
        HashMap<Character, Integer> map1 = new HashMap<>(); //(char,freq) pair
        HashMap<Character, Integer> map2 = new HashMap<>(); //(char,freq) pair
        String s = "rat", t = "car";
        if(s.length()!=t.length()) {System.out.println("invalid Anagram"); return;}
         for(int i=0; i<s.length(); i++){
             char ch = s.charAt(i);
             if(map1.containsKey(ch)) {
                 int freq = map1.get(ch);
                 map1.put(ch,freq+1); //updating freq
             }
             else map1.put(ch,1);
         }
         for(int i=0; i<t.length(); i++){
             char ch = t.charAt(i);
             if(map2.containsKey(ch)){
                 int freq = map2.get(ch);
                 map2.put(ch,freq+1);
             }
             else map2.put(ch,1);
         }
         for(int i=0; i<s.length(); i++){
             char ch = s.charAt(i);
             if(!map2.containsKey(ch)) { //if map2 does not contain a particular key from map1--> return false
                 System.out.println("Invalid Anagram");
                 return;
             }
             if(map1.get(ch) != map2.get(ch)) {
                 System.out.println("Invalid Anagram");
                 return;
             }
        }
        System.out.println("Valid Anagram");
    }
}
