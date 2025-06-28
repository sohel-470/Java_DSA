package Stacks;

import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String[] args) {
        Stack<String> val = new Stack<>();
        String s = "953+4*6/-"; //postfix
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57) val.push(ch+"");
            else{
                String v2 = val.pop();
                String v1 = val.pop();
                val.push(ch+v1+v2);
            }
        }
        System.out.println(val.peek());
    }
}
