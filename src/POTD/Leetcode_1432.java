package POTD;

import java.util.ArrayList;
import java.util.Collections;

public class Leetcode_1432 {
    static int maxDiff(int nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> brr = new ArrayList<>();
        int x = nums;
        while(x>0){
            int dig = x%10;
            arr.add(dig);
            brr.add(dig);
            x /= 10;
        }
        Collections.reverse(arr);
        Collections.reverse(brr);
        int n = arr.size();
        //to maximise nums and store it in 'a'
        int i=0, a=0;
        while(i<n && arr.get(i)==9) i++;
        if(i==n) a = nums;
        else{
            int ele = arr.get(i);
            for(int j=0; j<n; j++) if(arr.get(j)==ele) arr.set(j,9);
            for(int j=0; j<n; j++) a = a*10 + arr.get(j);
        }
        //to mimise nums and store it in 'b'
        i=0;
        int b=0;
        if(brr.get(0)==1){
            while(i<n && brr.get(i)==1 || brr.get(i)==0) i++;
            System.out.println(i);
            if(i==n) b = nums;
            else{
                int ele = brr.get(i);
                for(int j=0; j<n; j++) if(brr.get(j)==ele) brr.set(j,0);
                for(int j=0; j<n; j++) b = b*10 + brr.get(j);
            }
        }
        else{ //brr.get(0)!=1
            int ele = brr.get(i);
            for(int j=0; j<n; j++) if(brr.get(j)==ele) brr.set(j,1);
            for(int j=0; j<n; j++) b = b*10 + brr.get(j);
        }
        return a-b;
    }
    public static void main(String[] args) {
        int num = 1101057;
        System.out.println(maxDiff(num));
    }
}
