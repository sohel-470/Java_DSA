package HackeRank;

import java.util.*;

public class UpAndDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        long sum=0;
        for(int i=0; i<n; i++){
            if(i%2==0) sum += (long)arr[i];
            else sum-= (long)arr[i];
        }
        System.out.println(sum);
    }
}
