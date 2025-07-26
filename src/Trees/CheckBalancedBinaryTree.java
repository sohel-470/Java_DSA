package Trees;

public class CheckBalancedBinaryTree {
    public static int levels(Node root,boolean[] flag){
        if(root==null) return 0;
        int leftLevels = levels(root.left,flag);
        int rightLevels = levels(root.right,flag);
        int diff = Math.abs(leftLevels-rightLevels);
        if(diff>1){
            flag[0] = false;
            return 0;//coz we don't need to check for further levels
        }
        return 1+Math.max(leftLevels,rightLevels);
    }
    public static boolean isBalanced(Node root) {
        if(root==null) return true; //coz null tree is always balanced
        boolean[] flag = {true}; //by default, we consider the tree is balanced
        levels(root,flag);
        return flag[0];
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

        System.out.println(isBalanced(a));
    }
}
