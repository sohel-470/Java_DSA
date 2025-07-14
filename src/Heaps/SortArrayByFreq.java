package Heaps;

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortArrayByFreq {
    static class Pair implements Comparable<Pair>{
        int ele;
        int freq;
        Pair(int ele, int freq){
            this.ele = ele;
            this.freq = freq;
        }
        public int compareTo(Pair p){
            if(this.freq==p.freq) return p.ele-this.ele;
            return this.freq-p.freq;
        }
    }
    static int[] frequencySort(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele:arr){
            if(map.containsKey(ele)) map.put(ele,map.get(ele)+1);
            else map.put(ele,1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int ele : map.keySet()){
            int freq = map.get(ele);
            pq.add(new Pair(ele,freq));
        }
        int i=0, j=0;
        while(pq.size()!=0){
            Pair p = pq.remove();
            int ele = p.ele;
            int freq = p.freq;
            for(j=i; j<i+freq; j++) arr[j] = ele;
            i=j;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3};
        int[] ans = frequencySort(arr);
        for(int ele:ans) System.out.print(ele+" ");
        System.out.println();
    }
}
