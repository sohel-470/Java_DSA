package Heaps;
//GFG-Connect all ropes into a single rope with the minimum total cost.
// The cost to connect two ropes is the sum of their lengths.

import java.util.PriorityQueue;

public class MinCostOfRopes {
    public static int minCost(int[] arr) {
        // code here
        if(arr.length==1) return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele:arr) pq.add(ele);
        int cost = 0;
        while(pq.size()>1){
            int x = pq.remove();
            int y = pq.remove();
            cost += x+y;
            pq.add(x+y);
        }
        return cost;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 6, 9};
        System.out.println(minCost(arr));
    }
}
