package Trees;

public class printKthLevel {
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

        int k=2;
        preorder(a,2,0);
        System.out.println();
    }
    public static void preorder(Node N, int k, int currLevel){
        if(N==null) return;
        if(currLevel==k) System.out.print(N.val+" ");
        preorder(N.left,k,currLevel+1);
        preorder(N.right,k,currLevel+1);
    }
}
