package Trees;

public class LCAofATree {
    public static boolean inTree(Node p, Node root){
        if(p==root) return true;
        if(root==null) return false;
        return inTree(p,root.left) || inTree(p,root.right);
    }
    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        if(p==root || q==root) return root;
        boolean pInLST = inTree(p,root.left);
        boolean qInLST = inTree(q,root.left);
        if(pInLST==true && qInLST==true) return lowestCommonAncestor(root.left,p,q);
        if(pInLST==false && qInLST==false) return lowestCommonAncestor(root.right,p,q);
        else return root;
    }

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

        Node n = lowestCommonAncestor(a,h,i);
        System.out.println(n.val);
    }
}
