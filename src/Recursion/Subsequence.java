package Recursion;

import java.util.ArrayList;

public class Subsequence {
    static ArrayList<String> arr = new ArrayList<>(); //global ArrayList
    public static void printSubsets(int i, String s, String ans){
        if(i==s.length()){
            arr.add(ans);
            return;
        }
        char ch = s.charAt(i);
        printSubsets(i+1,s,ans); //right call--> Not take
        printSubsets(i+1,s,ans+ch); //left call--> Take
    }
    public static void main(String[] args) {
        String s = "soh";
        arr = new ArrayList<>(); //Reset--> Always do when something's declared globally
        printSubsets(0,s,"");
        System.out.println(arr);
    }
}
