package Trees;

public class KthSmallestInBST {
    public static void inorder(Node root, int k, int[] count,int[] ans){
        if(root==null) return;
        inorder(root.left,k,count,ans);
        count[0]++;
        if(count[0]==k){
            ans[0]=root.val;
            return;
        }
        inorder(root.right,k,count,ans);
    }
    public static int kthSmallest(Node root, int k) {
        int[] count = {0};
        int[] ans = {0};
        inorder(root,k,count,ans);
        return ans[0];
    }
    public static void main(String[] args) {
        
    }
}
