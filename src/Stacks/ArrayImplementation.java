package Stacks;

public class ArrayImplementation {
    private static class Stack{
        private int[] arr = new int[5];
        private int idx=0;
        void push(int x){
            if(isFull()){
                System.out.println("Stack is full!");
                return;
            }
            arr[idx++] = x;
        }
        int peek(){
            if(idx==0){
                System.out.println("Stack is empty!");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("Stack is empty!");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }
        int size(){
            return idx;
        }
        int capacity(){
            return arr.length;
        }
        void display(){
            for(int i=0; i<idx; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        boolean isEmpty(){
            if(idx==0) return true;
            return false;
        }
        boolean isFull(){
            if(idx==arr.length) return true;
            return false;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println(st.isEmpty());
        st.push(4); st.push(5); st.push(1); st.push(2);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        st.push(7); // 4 5 1 7
        st.push(8); // 4 5 1 7 8
        st.display();
        System.out.println(st.isFull());
        st.push(9); //Stack Overflow
        System.out.println(st.capacity());
    }
}
