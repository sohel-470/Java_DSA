package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class PrintingQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> r = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int n = q.size();
        for(int i=0; i<n; i++){
            int top = q.remove();
            System.out.print(top+" ");
            r.add(top);
        }
        for(int i=0; i<n; i++) q.add(r.remove());
    }
}
