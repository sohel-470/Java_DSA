package Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class IterativeTraversals_DFS {
    public static void main(String[] args) {
        Node a = new Node(1); //a = root
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        System.out.println("PreOrder: "+preorder(a));

        System.out.println("Postorder: "+postorder(a));

        System.out.println("Inorder: "+inorder(a));

    }
    public static List<Integer> preorder(Node root){
        List<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(st.size()>0){
            Node node = st.pop();
            ans.add(node.val);
            if(node.right!=null) st.push(node.right);
            if(node.left!=null) st.push(node.left);
        }
        return ans;
    }
    public static List<Integer> postorder(Node root){
        List<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(st.size()>0){
            Node node = st.pop();
            ans.add(node.val);
            if(node.left!=null) st.push(node.left);
            if(node.right!=null) st.push(node.right);
        }
        Collections.reverse(ans);
        return ans;
    }
    public static List<Integer> inorder(Node root){
        List<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node temp = root;
        while(true){
            if(temp!=null){
                st.push(temp);
                temp = temp.left;
            }else{
                if(st.isEmpty()) return ans;
                Node top = st.pop();
                ans.add(top.val);
                temp = top.right;
            }
        }
    }
}
