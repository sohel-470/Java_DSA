package Stacks;

import java.util.Stack;
/*Just like Arrays, Stacks are also passed-by-reference. Means the function just points to our original stack.
If we change any value of stack in the function, then, the stack in the main function also gets updated.
*/
public interface DisplayRecursion {
    static void displayReverse(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayReverse(st);
        st.push(top);
    }
    static void display(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        display(st);
        System.out.print(top+" ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);st.push(2);st.push(3);st.push(4);st.push(5);
        System.out.println(st+" st");
        displayReverse(st);
        System.out.println();
        display(st);
    }
}
