package Stacks;

import java.util.Stack;

//Leetcode 20
public class ValidParentheses {
    static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='(') st.push(ch);
            else if(ch=='{') st.push(ch);
            else if(ch=='[') st.push(ch);
            else if(ch==')'){
                if(st.isEmpty()) return false;
                if(st.peek()=='(') st.pop();
                else return false;
            }
            else if(ch=='}'){
                if(st.isEmpty()) return false;
                if(st.peek()=='{') st.pop();
                else return false;
            }
            else{ // ch == ']'
                if(st.isEmpty()) return false;
                if(st.peek()=='[') st.pop();
                else return false;
            }
        }
        if(st.isEmpty()) return true;
        return false;
    }
    public static void main(String[] args) {
        String s = "[(]){}";
        System.out.println(isValid(s));
    }
}
