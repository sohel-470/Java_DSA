package Heaps;

import java.util.Collections;
import java.util.Objects;
import java.util.PriorityQueue;

//Leetcode 973
public class K_ClosestPointstoOrigin {
    static class Triplet implements Comparable<Triplet>{ //Object
        int d;
        int x;
        int y;
        Triplet(int d, int x, int y){ //Constructor
            this.d = d;
            this.x = x;
            this.y = y;
        }
        public int compareTo(Triplet t) {
            return this.d - t.d;
        }
    }
    static int[][] kClosest(int[][] arr, int k) {
        int[][] ans = new int[k][2];
        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<arr.length; i++){
            int x = arr[i][0];
            int y = arr[i][1];
            int d = x*x + y*y;
            pq.add(new Triplet(d,x,y));
            if(pq.size()>k) pq.remove();
        }
        for(int i=0; i<k; i++){
            Triplet t = pq.remove();
            ans[i][0] = t.x;
            ans[i][1] = t.y;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] points = {{3,3},{5,-1},{-2,4},{1,0},{3,2}};
        int k = 3;
        int[][] ans = kClosest(points,k);
        for(int i=0; i<ans.length; i++) System.out.println(ans[i][0]+" "+ans[i][1]);
    }
}
