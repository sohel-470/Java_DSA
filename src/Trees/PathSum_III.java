package Trees;

public class PathSum_III {
    public static int traverse(Node root,long rem){
        if(root==null) return 0;
        int count=0;
        if(rem==root.val) count++;
        count += traverse(root.left,rem-root.val)+traverse(root.right,rem-root.val);
        return count;
    }
    public static int pathSum(Node root, int targetSum) {
        if(root==null) return 0;
        return traverse(root,targetSum)+pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
    }
    public static void main(String[] args) {
        
    }
}
