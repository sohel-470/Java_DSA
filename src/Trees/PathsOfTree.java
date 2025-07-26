package Trees;

import java.util.ArrayList;
import java.util.List;

public class PathsOfTree {
    public static void travel(Node root, List<String> ans, String s){
        if(root==null) return;
        if(root.left==null && root.right==null){
            s += root.val;
            ans.add(s);
            return;
        }
        travel(root.left,ans,s+root.val+"->");
        travel(root.right,ans,s+root.val+"->");
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

        List<String> ans = new ArrayList<>();
        travel(a,ans,"");
        System.out.println(ans);
    }
}
