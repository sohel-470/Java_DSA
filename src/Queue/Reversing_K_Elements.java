package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reversing_K_Elements {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        for(int i=1; i<=9; i++) q.add(i);
        System.out.println(q);
        int n = q.size();
        int k = 4; //Reverse K elements from first

        for(int i=0; i<k; i++) st.push(q.remove());// q = 5 6 7 8 9   st = 1 2 3 4
        while(st.size()!=0) q.add(st.pop());// q = 5 6 7 8 9 4 3 2 1
        for(int i=0; i<n-k; i++) q.add(q.remove());
        System.out.println(q); // 4 3 2 1 5 6 7 8 9
    }
}
