package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_SmallestElement {
    static int usingMinHeap(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : arr) pq.add(ele);
        for(int i=0; i<k-1; i++) pq.remove();
        return pq.peek();
    }
    static int usingMaxHeap(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:arr) pq.add(ele);
        while(pq.size()>k) pq.remove();
        return pq.peek();
    }
    public static void main(String[] args) {

        int[] arr = {10,2,3,8,-4,-2,6};
        int k=3;
        System.out.println(usingMinHeap(arr,k));
        System.out.println(usingMaxHeap(arr,k));
    }
}
