package Stacks;

import java.util.Stack;

public class InfixEvaluation {
    public static void main(String[] args) {
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        String s = "9-(5+3*2)*4/6";
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            int ascii = (int)ch; // '0'--> 48 and '9'--> 57
            if(ascii>=48 && ascii<=57){ //ch is an integer
                int x = ascii-48;
                val.push(x);
            }
            else{ //ch is an operator
                if(op.isEmpty() || ch == '(' || op.peek()=='(') op.push(ch);
                else if(ch == ')'){
                    while(op.peek()!='(') {
                        int v2 = val.pop();
                        int v1 = val.pop();
                        char opr = op.pop();
                        if (opr == '+') val.push(v1 + v2);
                        else if (opr == '-') val.push(v1 - v2);
                        else if (opr == '*') val.push(v1 * v2);
                        else if (opr == '/') val.push(v1 / v2);
                    }
                    op.pop(); //removal of '('
                }

                else if(ch == '+' || ch == '-'){
                    int v2 = val.pop();
                    int v1 = val.pop();
                    char opr = op.pop();
                    if (opr == '+') val.push(v1 + v2);
                    else if (opr == '-') val.push(v1 - v2);
                    else if (opr == '*') val.push(v1 * v2);
                    else if (opr == '/') val.push(v1 / v2);
                    op.push(ch);
                }

                else if(ch == '*' || ch=='/'){
                    if (op.peek() == '*' || op.peek() == '/') {
                        int v2 = val.pop();
                        int v1 = val.pop();
                        char opr = op.pop();
                        if(opr=='*') val.push(v1 * v2);
                        else if(opr=='/') val.push(v1 / v2);
                        op.push(ch);
                    }
                    else op.push(ch); //op.peek() == + OR -}
                }
            }
        }
        while(op.size()>0){
            int v2 = val.pop();
            int v1 = val.pop();
            char opr = op.pop();
            if(opr=='+') val.push(v1+v2);
            else if(opr=='-') val.push(v1-v2);
            else if(opr=='*') val.push(v1*v2);
            else if(opr=='/') val.push(v1/v2);
        }
        System.out.println(val.peek());
    }
}
