package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintingSubsequences_Array {
    static void printSubseq(int[] arr, List<Integer> al, List<List<Integer>> ans, int idx){
        int n = arr.length;
        if(idx==n){
            ans.add(new ArrayList<>(al));
            return;
        }
        //take the particular idx into the subsequence
        al.add(arr[idx]);
        printSubseq(arr,al,ans,idx+1);
        //revert back to original condition(coz idx element was added to subsequence)
        al.remove(al.size()-1);
        //not take the particular idx into the subsequence
        printSubseq(arr,al,ans,idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        int n = arr.length;
        List<Integer> al = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        printSubseq(arr,al,ans,0);//array,list,index,size
        System.out.println(ans);
    }
}
