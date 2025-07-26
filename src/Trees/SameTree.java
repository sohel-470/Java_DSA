package Trees;

public class SameTree {
    public static boolean isSameTree(Node p, Node q) {
        if(p==null && q==null) return true;
        if(p==null && q!=null) return false;
        if(p!=null && q==null) return false;
        if(p.val!=q.val) return false;
        if(isSameTree(p.left,q.left)==false) return false;
        if(isSameTree(p.right,q.right)==false) return false;
        return true;
    }
    public static void main(String[] args) {

    }
}
