package Trees;
class Node {
    int val; //By default= 0
    Node left;
    Node right;
    Node(int val) {
        this.val = val;
    }
}
public class NodeOfTree {
    public static void main(String[] args) {
        Node a = new Node(1); //a = root
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);

        a.left = b; a.right = c;
    }
}
