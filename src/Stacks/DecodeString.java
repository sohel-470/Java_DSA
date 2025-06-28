package Stacks;

import java.util.Stack;

//Leetcode 394
public class DecodeString {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        String s = "zx2[ab3[cd]]ef";
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);

            if(ch!=']') st.push(ch+"");
            else { //ch==']' --> before there must have been a '['
                String x = "";
                while(!st.peek().equals("[")) x = st.pop()+x;
                st.pop(); //to remove '['
                String num = "";
                while(st.size()>0 && (int)st.peek().charAt(0)>=48 && (int)st.peek().charAt(0)<=57) num = st.pop()+num; //checking if the peek value is integer or not
                String y = "";
                for(int j=0; j<Integer.valueOf(num); j++) y += x;
                st.push(y);
            }
        }
        String ans = "";
        while(st.size()>0) {
            ans = st.pop()+ans;
        }
        System.out.println(ans);
    }
}