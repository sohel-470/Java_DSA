package POTD;

import java.util.ArrayList;
import java.util.Collections;

public class Leetcode_2566 {
    static int minMaxDifference(int num) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> brr = new ArrayList<>();
        int x = num;
        while(x>0){
            int dig = x%10;
            arr.add(dig);
            x /= 10;
        }
        Collections.reverse(arr);
        int n = arr.size();
        System.out.println(arr);
        //deep copy of arr
        for(int i=0; i<n; i++) brr.add(arr.get(i));
        //to maximise the num
        int i=0;
        while(i<n && arr.get(i)==9) i++;
        if(i==n) return num;
        int ele = arr.get(i);
        for(int j=0; j<n; j++) if(arr.get(j)==ele) arr.set(j,9);
        System.out.println(arr);
        int max=0;
        for(int j=0; j<n; j++) max = max*10 + arr.get(j);
        System.out.println(max);
        //to minimise the num
        ele = brr.get(0);
        for(int j=0; j<n; j++) if(brr.get(j)==ele) brr.set(j,0);
        int min=0;
        for(int j=0; j<n; j++) min = min*10 + brr.get(j);
        System.out.println(min);
        return max-min;
    }
    public static void main(String[] args) {
        int num = 90;
        System.out.println(minMaxDifference(num));
    }
}
