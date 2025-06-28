package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Basics {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st + " st");
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4); //throws error if q is full
        q.offer(5);//returns "false" if q is full
        System.out.println(q + " q");
        st.pop(); //LIFO
        q.remove();//FIFO
        System.out.println(st + " st");
        System.out.println(q + " q");
        System.out.println("Size: " + q.size());

        q.remove();//throws error if q is empty
        q.poll();//returns "null" if q is empty
        System.out.println(q.element());//throws error if q is empty
        System.out.println(q.peek());//returns "null" if q is empty
        System.out.println(q.isEmpty());
    }
}
