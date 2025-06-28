package Stacks;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        String s = "9-(5+3)*4/6";
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57) val.push(ch+"");
            else{
                if(op.isEmpty() || ch=='(' || op.peek()=='(') op.push(ch);
                else if(ch==')'){
                    while(op.peek()!='('){
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char opr = op.pop();
                        val.push(v1+v2+opr);
                    }
                    op.pop();
                }
                else if(ch=='+' || ch=='-'){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char opr = op.pop();
                    val.push(v1+v2+opr);
                    op.push(ch);
                }
                else if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char opr = op.pop();
                        val.push(v1+v2+opr);
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        while(op.size()>0){
            String v2 = val.pop();
            String v1 = val.pop();
            char opr = op.pop();
            val.push(v1+v2+opr);
        }
        System.out.println(val.peek());
    }
}
