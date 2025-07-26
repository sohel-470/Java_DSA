package Trees;

public class BT_From_Pre_In {
    public static Node helper(int[] preorder, int[] inorder, int pl, int ph, int il, int ih) {
        if(pl>ph || il>ih) return null;
        Node root = new Node(preorder[pl]);
        int r=0;
        while(preorder[pl] != inorder[r]) r++;
        int ls = r-il;
        root.left = helper(preorder,inorder, pl+1, pl+ls, il, r-1);
        root.right = helper(preorder,inorder, pl+ls+1, ph, r+1, ih);
        return root;
    }
    public static Node buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return helper(preorder,inorder,0,n-1,0,n-1);
    }
    public static void main(String[] args) {
        
    }
}
