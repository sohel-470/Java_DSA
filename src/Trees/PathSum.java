package Trees;
//Leetcode 112-> sum from root to leaf node
public class PathSum {
    public static boolean traverse(Node N, int targetSum, int sum){
        if(N==null) return false;
        if(N.left==null && N.right==null){ //leaf node
            sum += N.val;
            if(sum==targetSum) return true;
            else return false;
        }
        return traverse(N.left, targetSum, sum+N.val) || traverse(N.right, targetSum, sum+N.val);
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

        int targetSum = 16;
        System.out.println(traverse(a,targetSum,0));
    }
}
