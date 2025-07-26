package Trees;

public class InvertingBinaryTree {
    public static void invert(Node N){
        if(N==null) return;
        //swapping of connections
        Node temp = N.left;
        N.left = N.right;
        N.right = temp;
        //inverting the LST & RST
        invert(N.left); //inverting the actual RST
        invert(N.right);//inverting the actual LST
    }




    public static void main(String[] args) {
//        Node a = new Node(1); //a = root
//        Node b = new Node(2);
//        Node c = new Node(3);
//        Node d = new Node(4);
//        Node e = new Node(5);
//        Node f = new Node(6);
//        Node g = new Node(7);
//
//        a.left = b; a.right = c;
//        b.left = d; b.right = e;
//        c.left = f; c.right = g;
//
//        display(a);
//        System.out.println();
//        invert(a);
//        display(a);
    }
    public static void display(Node N){
        if(N==null) return;
        System.out.print(N.val+" ");
        display(N.left); //Left SubTree
        display(N.right);//Right SubTree
    }
}
