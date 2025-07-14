package Heaps;

import java.util.PriorityQueue;

public class Kth_LargestElement {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] arr = {10,2,3,8,-4,-2,6};
        int k=3;
        for(int ele:arr){
            pq.add(ele);
            if(pq.size()>k) pq.remove();
        }
        System.out.println(pq.peek());
    }
}
