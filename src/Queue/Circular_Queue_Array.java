package Queue;

public class Circular_Queue_Array {
    public static class cqa{
        int[] arr = new int[5];
        int n = arr.length;
        int f=-1, r=-1, size=0; //attributes
        public void add(int val) throws Exception{
            if(size==n) throw new Exception("Queue is full!");
            if(f==-1) f++;
            arr[(++r)%n] = val;
            size++;
        }
        public int remove() throws Exception{
            if(size==0) throw new Exception("Queue is empty!");
            size--;
            return arr[(f++)%n];
        }
        public int peek() throws Exception{
            if(size==0) throw new Exception("Queue is empty!");
            return arr[f%n];
        }
        public void display(){
            if(size==0) {
                System.out.println("Queue is empty!");
                return;
            }
            for(int i=f; i<=r; i++) System.out.print(arr[i%n]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        cqa q = new cqa();
//        q.remove(); //error
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
//        q.add(6); //error
        System.out.println(q.remove());
        q.display();
//        System.out.println(q.peek());
        q.remove();
        q.display();
        q.add(7);
        q.display();
        q.add(8);
        q.display();
//        q.add(9); //error
        q.remove();
        q.display();
        System.out.println(q.size); //we can also use attributes.
    }
}
