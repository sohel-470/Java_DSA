package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq); //1 2 3 4
        dq.addFirst(5); // 5 1 2 3 4
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq); // 5 1 2 3
        dq.removeFirst();
        System.out.println(dq); // 1 2 3

        dq.add(16); //Normal add in queue(from last)
        System.out.println(dq); // 1 2 3 16
        dq.remove(); //Normal removal in queue(from first)
        System.out.println(dq);// 2 3 16
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq); // 2 3 16 1 2 3 4
        dq.removeLastOccurrence(3);
        System.out.println(dq); // 2 3 16 1 2 4
        dq.addLast(3);
        dq.removeFirstOccurrence(3);
        System.out.println(dq); // 2 16 1 2 4 3
        dq.clear(); //Empties the deque
        System.out.println(dq);
    }
}
