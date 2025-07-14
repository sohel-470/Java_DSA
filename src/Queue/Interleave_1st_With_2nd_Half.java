package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Given a Queue of even size, Interleave 1st half with 2nd half using stacks;
public class Interleave_1st_With_2nd_Half {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=8; i++) q.add(i);// q = 1 2 3 4 5 6 7 8
        int n = q.size();
        for(int i=0; i<n/2; i++) st.push(q.remove());
        for(int i=0; i<n/2; i++) q.add(st.pop());
        // q = 5 6 7 8 4 3 2 1
        for(int i=0; i<n/2; i++) st.push(q.remove());
        //q = 4 3 2 1   st = 5 6 7 8
        for(int i=0; i<n/2; i++){
            q.add(st.pop());
            q.add(q.remove());
        }
        // q = 8 4 7 3 6 2 5 1
        while(!q.isEmpty()) st.push(q.remove());
        while(!st.isEmpty()) q.add(st.pop());
        // q = 1 5 2 6 3 7 4 8
        System.out.println(q);
    }
}
