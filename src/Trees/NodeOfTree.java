package Trees;
class Node {
    int val; //By default= 0
    Node left;
    Node right;
    Node(int val) {
        this.val = val;
    }
}

public class NodeOfTree {
    public static void display(Node N){
        if(N==null) return;
        System.out.print(N.val+" ");
        display(N.left); //Left SubTree
        display(N.right);//Right SubTree
    }
    public static int sum(Node N){
        if(N==null) return 0;
        return N.val+sum(N.left)+sum(N.right);
    }
    public static int product(Node N){
        if(N==null) return 1;
        return N.val * product(N.left) * product(N.right);
    }
    public static int max(Node N){
        if(N==null) return Integer.MIN_VALUE;
        return Math.max(N.val,Math.max(max(N.left),max(N.right)));
    }
    public static int size(Node N){
        if(N==null) return 0;
        return 1 + size(N.left) + size(N.right);
    }
    public static int level(Node N){
        if(N==null) return 0;
        return 1 + Math.max(level(N.left),level(N.right));
    }
    public static int diameter(Node root) {
        if(root==null) return 0;
        int currDia = level(root.left)+level(root.right);
        int a = diameter(root.left);
        int b = diameter(root.right);
        return Math.max(currDia,Math.max(a,b));
    }
    public static void main(String[] args) {
        Node a = new Node(1); //a = root
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        System.out.println(e.val); //val of Node e
        System.out.println(a.left.right.val); //val of Node e
        display(a); //1 4 2 6 3 5
        System.out.println();
        a.val = 90;//updating value of a(root)
        a.left = null;//detaching the LST of a(root)
        System.out.println(a.val);
        display(a); //90 3 5
        System.out.println("\n");
        a.left = b;//reattaching the LST of root
        a.val = 1;
        System.out.println(sum(a));
        System.out.println(product(a));
        System.out.println(max(a));
        System.out.println(size(a));
        System.out.println(level(a));
        System.out.println(diameter(a));
    }
}
