package Trees;

public class ValidBST {
//    Method 1:
    public static void inorder(Node root, long[] prev, boolean[] flag){
        if(root==null) return;
        inorder(root.left,prev,flag);
        if(root.val<=prev[0]) flag[0] = false;
        prev[0] = root.val;
        inorder(root.right,prev,flag);
    }
    public static boolean isValidBST(Node root) {
        long[] prev = {Long.MIN_VALUE};
        boolean[] flag = {true};
        inorder(root,prev,flag);
        return flag[0];
    }

//    Method 2:
    public static long max(Node root, boolean[] flag){
        if(root==null) return Long.MIN_VALUE;
        long maxLeft = max(root.left,flag);
        if(root.val<=maxLeft) {flag[0] = false; return -1;}
        long maxRight = max(root.right,flag);
        return Math.max(root.val, Math.max(maxLeft,maxRight));
    }
    public static long min(Node root, boolean[] flag){
        if(root==null) return Long.MAX_VALUE;
        long minLeft = min(root.left,flag);
        long minRight = min(root.right,flag);
        if(root.val>=minRight) {flag[0] = false; return -1;}
        return Math.min(root.val, Math.min(minLeft,minRight));
    }
    public static boolean isValidBST1(Node root) {
        boolean[] flag = {true};
        max(root,flag);
        min(root,flag);
        return flag[0];
    }
    public static void main(String[] args) {

    }
}
