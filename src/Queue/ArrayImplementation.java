package Queue;

public class ArrayImplementation {
    public static class queueA{
        int f = -1, r = -1, size = 0;
        int[] arr = new int[100]; //considering 100 size
        public void add(int val){
            if(r==arr.length-1){
                System.out.println("Queue is full!");
                return;
            }
            if(r==-1) f=0; //Initially, as no elements were present, so r was at -1.
            arr[++r] = val;
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is empty!");
                return 0;
            }
            size--;
            return arr[f++];
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is empty!");
                return 0;
            }
            return arr[f];
        }
        public boolean isEmpty(){
            if(size==0) return true;
            return false;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty!");
                return;
            }
            for(int i=f; i<=r; i++) System.out.print(arr[i]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queueA q = new queueA(); // queueA = Object; q = class;
        q.display();
        q.add(55);
        q.add(5);
        q.add(9);
        q.add(27);
        q.display();
        System.out.println(q.remove());
        q.display();
        System.out.println(q.peek());
    }
}
