package HashTable;

import java.util.HashMap;

public class ArrayPairsSumDivByK {
    static boolean canArrange(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int ele = (arr[i]%k+k)%k;
            int rem = k - ele;
            if(map.containsKey(rem)){
                int freq = map.get(rem);
                map.put(rem,freq-1);
                if(map.get(rem)==0) map.remove(rem);
            }
            else {
                if(map.containsKey(0) && ele==0){ //arr[i]%k=0 & rem=k
                    int zerofreq = map.get(0);
                    map.put(0,zerofreq+1);
                }
                else if(map.containsKey(ele)){
                    int elefreq = map.get(ele);
                    map.put(ele,elefreq+1);
                }
                else map.put(ele,1);
            }
        }
        if(map.containsKey(0) && map.get(0)%2==0) map.remove(0);
        System.out.println(map);
        if(map.size()==0) return true;
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {-4,-7,5,2,9,1,10,4,-8,-3};
        int k = 3;
        System.out.println(canArrange(arr,k));
    }
}
