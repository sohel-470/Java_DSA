package HashTable;

import java.util.HashMap;
import java.util.HashSet;

public class Length3PalindromeSequence {
    static int countPalindromicSubsequence(String s) {
        HashMap<Character,Integer> fmap = new HashMap<>();
        HashMap<Character,Integer> lmap = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        int count=0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!fmap.containsKey(ch)) fmap.put(ch,i); //if ch not present in fmap
            lmap.put(ch,i);
        }
        System.out.println(fmap);
        System.out.println(lmap);
        for(char ch : fmap.keySet()){
            int fidx=fmap.get(ch), lidx=lmap.get(ch);
            if(lidx-fidx>=2){
                for(int i=fidx+1; i<lidx; i++){
                    set.add(s.charAt(i));
                }
                count += set.size();
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countPalindromicSubsequence("ckafnafqo"));
    }
}
