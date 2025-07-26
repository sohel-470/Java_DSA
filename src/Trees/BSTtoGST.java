package Trees;

import java.util.ArrayList;
import java.util.List;

public class BSTtoGST {
    // Method 1:
    public static void inorder(Node root, List<Node> arr){
        if(root==null) return;
        inorder(root.left,arr);
        arr.add(root);
        inorder(root.right,arr);
    }
    public static Node bstToGst(Node root) {
        List<Node> arr = new ArrayList<>();
        inorder(root,arr);
        int n = arr.size();
        for(int i=n-2; i>=0; i--) arr.get(i).val += arr.get(i+1).val;
        return root;
    }
    
    //Method 2:
    public static void reverseInorder(Node root, int[] prevSum){
        if(root==null) return;
        reverseInorder(root.right,prevSum);
        root.val += prevSum[0];
        prevSum[0] = root.val;
        reverseInorder(root.left,prevSum);
    }
    public static Node bstToGst1(Node root) {
        int[] prevSum = {0};
        reverseInorder(root,prevSum);
        return root;
    }
    public static void main(String[] args) {
        
    }
}
