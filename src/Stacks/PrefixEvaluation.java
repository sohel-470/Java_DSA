package Stacks;

import java.util.Stack;

public class PrefixEvaluation {
    public static void main(String[] args) {
        Stack<Integer> val = new Stack<>();
        String s = "-9/*+5346"; //Infix: 9-(5+3)*4/6
        int n = s.length();
        for(int i=n-1; i>=0; i--){
            char ch = s.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57) val.push(ascii-48);
            else{
                int v1 = val.pop();
                int v2 = val.pop();
                if(ch == '+') val.push(v1+v2);
                else if(ch == '-') val.push(v1-v2);
                else if(ch == '*') val.push(v1*v2);
                else if(ch == '/') val.push(v1/v2);
            }
        }
        System.out.println(val.peek());
    }
}
