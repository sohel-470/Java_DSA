package Heaps;

import java.util.HashMap;
import java.util.PriorityQueue;

//Leetcode 347
public class Top_K_FrequentElements {
    static class Pair implements Comparable<Pair>{
        int ele;
        int freq;
        Pair(int ele, int freq){
            this.ele = ele;
            this.freq = freq;
        }
        public int compareTo(Pair p){
            return this.freq - p.freq;
        }
    }
    public static int[] topKFrequent(int[] arr, int k) {
        int n = arr.length;
        int[] ans = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int ele:arr){
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele,freq+1);
            } else map.put(ele,1);
        }
        for(int ele : map.keySet()){
            int freq = map.get(ele);
            pq.add(new Pair(ele,freq));
            if(pq.size()>k) pq.remove();
        }
        for(int i=0; i<k; i++) ans[i] = pq.remove().ele;
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        int k=2;
        int[] ans = topKFrequent(arr,k);
        for(int ele:ans) System.out.print(ele+" ");
        System.out.println();
    }
}
