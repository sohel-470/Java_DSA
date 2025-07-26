package Trees;

public class BT_From_Post_In {
    public static Node helper(int[] postorder,int[] inorder, int pl, int ph, int il, int ih){
        if(pl>ph || il>ih) return null;
        Node root = new Node(postorder[ph]);
        int r = 0;
        while(postorder[ph] != inorder[r]) r++;
        int ls = r-il;
        root.left = helper(postorder,inorder, pl, pl+ls-1, il, r-1);
        root.right = helper(postorder,inorder, pl+ls, ph-1, r+1, ih);
        return root;
    }
    public static Node buildTree(int[] inorder, int[] postorder) {
        int n = postorder.length;
        return helper(postorder,inorder,0,n-1,0,n-1);
    }
    public static void main(String[] args) {
        
    }
}
