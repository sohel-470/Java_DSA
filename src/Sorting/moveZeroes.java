package Sorting;

import java.util.ArrayList;

public class moveZeroes {
    public static void main(String[] args) {
        int[] arr = {1,0,4,0,2,-40,100,0,5};
        ArrayList<Integer> a = new ArrayList<>();
        int noz = 0;
        for(int ele:arr){
           if(ele!=0) a.add(ele);
           else noz++;
        }
        for(int i=0; i<noz; i++){
            a.add(0);
        }
        for(int i=0; i<arr.length; i++){
            arr[i] = a.get(i);
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
