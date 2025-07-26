package Trees;

public class MaxOfaTree {
    static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        int leftMax = max(root.left);
        int rightMax = max(root.right);
        return Math.max(root.val,Math.max(leftMax,rightMax));
    }
    public static void main(String[] args) {
        Node a = new Node(1); //a = root
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(60);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.left = h; f.right = i;

        System.out.println(max(a));
    }
}
