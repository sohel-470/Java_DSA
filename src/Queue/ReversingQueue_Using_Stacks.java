package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReversingQueue_Using_Stacks {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=5; i++) q.add(i); // q = 1 2 3 4 5
        Stack<Integer> st = new Stack<>();
        while(q.size()!=0) st.push(q.remove());// st = 1 2 3 4 5
        while(st.size()!=0) q.add(st.pop()); // q = 5 4 3 2 1
        System.out.println(q);
    }
}
