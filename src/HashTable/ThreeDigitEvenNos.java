package HashTable;
 //Leetcode 2094  TC = O(n+500)
import java.util.*;
public class ThreeDigitEvenNos {
     static int[] findEvenNumbers(int[] arr) {
         ArrayList<Integer> list = new ArrayList<>();
         HashMap<Integer,Integer> map = new HashMap<>();
         for(int ele : arr){
             if(map.containsKey(ele)) {
                 int freq = map.get(ele);
                 map.put(ele,freq+1);
             }
             else map.put(ele,1);
         }
         for(int i=100; i<=999; i+=2){
             int x = i;
             int c = x%10; x/=10;
             int b = x%10; x/=10;
             int a = x;
             if(map.containsKey(a)){
                 int afreq = map.get(a);
                 map.put(a,afreq-1);
                 if(map.get(a)==0) map.remove(a);
                 if(map.containsKey(b)){
                     int bfreq = map.get(b);
                     map.put(b,bfreq-1);
                     if(map.get(b)==0) map.remove(b);
                     if(map.containsKey(c)){
                         list.add(i);
                     }
                     map.put(b,bfreq);
                 }
                 map.put(a,afreq);
             }
         }
         int[] ans = new int[list.size()];
         for(int i=0; i<list.size(); i++){
             ans[i] = list.get(i);
         }
         Arrays.sort(ans);
         return ans;
     }
    public static void main(String[] args) {
        int[] arr = {2,2,8,8,2};
        for(int ele :findEvenNumbers(arr)){
            System.out.print(ele+" ");
        }
    }
}
