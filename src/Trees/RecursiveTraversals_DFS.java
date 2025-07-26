package Trees;

public class RecursiveTraversals_DFS {
    public static void main(String[] args) {
        Node a = new Node(1); //a = root
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.left = h; f.right = i;

        System.out.print("Preorder:    ");
        preorder(a);
        System.out.println();
        System.out.print("Inorder:     ");
        inorder(a);
        System.out.println();
        System.out.print("Postorder:   ");
        postorder(a);
        System.out.println();
    }
    public static void preorder(Node N){
        if(N==null) return;
        System.out.print(N.val+" ");
        preorder(N.left); //Left SubTree
        preorder(N.right);//Right SubTree
    }
    public static void inorder(Node N){
        if(N==null) return;
        inorder(N.left); //Left SubTree
        System.out.print(N.val+" ");
        inorder(N.right);//Right SubTree
    }
    public static void postorder(Node N){
        if(N==null) return;
        postorder(N.left); //Left SubTree
        postorder(N.right);//Right SubTree
        System.out.print(N.val+" ");
    }



}
