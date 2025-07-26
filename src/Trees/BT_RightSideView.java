package Trees;

import java.util.ArrayList;
import java.util.List;

public class BT_RightSideView {
    public static int levels(Node root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
    public static void preorder(Node root,List<Integer> ans,int currLevel){
        if(root==null) return;
        ans.set(currLevel,root.val);  //IMPORTANT LINE
        preorder(root.left,ans,currLevel+1);
        preorder(root.right,ans,currLevel+1);
    }
    public static List<Integer> rightSideView(Node root) {
        List<Integer> ans = new ArrayList<>();
        int n = levels(root);
        for(int i=0; i<n; i++) ans.add(0);
        preorder(root,ans,0);
        return ans;
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

        System.out.println(rightSideView(a));
        //We can use any DFS(preorder/inorder/postorder) provided left should come first & then right.
        //Coz, the left nodes get updated by right nodes in arraylist
    }
}
