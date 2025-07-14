package Heaps;
//Leetcode 658
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class K_ClosestElements {
    //Here Array must be sorted
    static List<Integer> usingSlidingWindow(int[] arr, int k, int x) {
        int n = arr.length;
        int[] dist = new int[n];
        for(int i=0; i<n; i++) dist[i] = Math.abs(arr[i]-x);
        int sum=0;
        for(int i=0; i<=k-1; i++) sum += dist[i];
        int min=sum;
        int i=1, j=k, midx=0;
        while(j<n){
            sum += dist[j];
            sum -= dist[i-1];
            if(sum<min){
                min = sum;
                midx = i;
            }
            i++; j++;
        }
        List<Integer> ans = new ArrayList<>();
        for(i=midx; i<=midx+k-1; i++) ans.add(arr[i]);
        return ans;
    }
    //Here also, Array must be sorted
    static List<Integer> expandingFromCentre(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        if(k==n){
            for(int i=0; i<n; i++) ans.add(arr[i]);
            return ans;
        }
        int[] dist = new int[n];
        for(int i=0; i<n; i++) dist[i] = Math.abs(arr[i]-x);
        int min=Integer.MAX_VALUE, midx=-1;
        for(int i=0; i<n; i++){
            if(dist[i]<min){
                min = dist[i];
                midx = i;
            }
        }
        // Start both pointers at midx
        int i = midx, j = midx;
        // Expand until we have k elements
        while (j-i < k-1) {
            if (i==0) j++;
            else if (j==n-1) i--;
            else if (dist[i-1] <= dist[j+1]) i--;
            else j++;
        }
        for(int z=i; z<=j; z++) ans.add(arr[z]);
        return ans;
    }

    //Here, Array need not be sorted
    static class Pair implements Comparable<Pair>{
        int diff;
        int ele;
        Pair(int diff, int ele){
            this.diff = diff;
            this.ele = ele;
        }
        public int compareTo(Pair p){
            if(this.diff==p.diff) return this.ele-p.ele;
            return this.diff-p.diff;
        }
    }
    static List<Integer> usingMaxHeap(int[] arr, int k, int x){
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for(int ele:arr){
            int diff = Math.abs(ele-x);
            pq.add(new Pair(diff,ele));
            if(pq.size()>k) pq.remove();
        }
        while(pq.size()!=0) ans.add(pq.remove().ele);
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4,6,7,8,9,18};
        int k = 3, x = 8;
        System.out.println(usingSlidingWindow(arr,k,x));
        System.out.println(expandingFromCentre(arr,k,x));
        System.out.println(usingMaxHeap(arr,k,x));
    }
}
