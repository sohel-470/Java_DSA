package Stacks;

import java.util.Stack;

public class BalancedBrackets {
    static boolean check(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='(') st.push('(');
            else { //ch = ')'
                if(st.isEmpty()) return false;
                else st.pop(); //top element is '('
            }
        }
        if(st.isEmpty()) return true;
        return false;
    }
    public static void main(String[] args) {
        String s = "(((()))";
        System.out.println(check(s));
    }
}
