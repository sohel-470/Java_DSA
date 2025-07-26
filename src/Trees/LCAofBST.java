package Trees;

public class LCAofBST {
    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        if(root==p || root==q) return root;
        else if(p.val<root.val && q.val>root.val) return root;
        else if(q.val<root.val && p.val>root.val) return root;
        else if(p.val<root.val && q.val<root.val) return lowestCommonAncestor(root.left,p,q);
        else return lowestCommonAncestor(root.right,p,q);
    }
    public static void main(String[] args) {
        
    }
}
