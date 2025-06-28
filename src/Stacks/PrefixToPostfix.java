package Stacks;

import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        Stack<String> val = new Stack<>();
        String s = "-9/*+5346"; //prefix
        int n = s.length();
        for(int i=n-1; i>=0; i--){
            char ch = s.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57) val.push(ch+"");
            else{
                String v1 = val.pop();
                String v2 = val.pop();
                val.push(v1+v2+ch);
            }
        }
        System.out.println(val.peek());
    }
}
