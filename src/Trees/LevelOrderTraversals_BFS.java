package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversals_BFS {
    public static class Pair{
        Node node;
        int level;
        Pair(Node node, int level){
            this.node = node;
            this.level = level;
        }
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

        //Printing Level Order by Queues[without any control of levels]
        System.out.print("Level order: ");
        usingQueue(a);
        System.out.println("\n");

        //Level order printing by Queues[by controlling levels]
        usingQueues2(a);
        System.out.println("\n");

        //We have total 4 levels in this tree.
        //So printing the tree using recursion[by controlling levels]
        for(int x=0; x<4; x++){
            preorder(a,x,0);
            System.out.println();
        }
    }
    public static void usingQueue(Node N){
        Queue<Node> q = new LinkedList<>();
        if(N!=null) q.add(N);
        while(q.size()>0){
            Node peek = q.remove();
            System.out.print(peek.val+" ");
            if(peek.left!=null) q.add(peek.left);
            if(peek.right!=null) q.add(peek.right);
        }
    }
    public static void usingQueues2(Node root){
        Queue<Pair> q = new LinkedList<>();
        int prevLevel = 0;
        if(root!=null) q.add(new Pair(root,0));
        while(q.size()>0){
            Pair peek = q.remove();
            Node node = peek.node;
            int currLevel = peek.level;
            //level maintenance
            if(currLevel!=prevLevel){
                System.out.println();
                prevLevel++;
            }
            //work
            System.out.print(node.val+" ");
            //new node update/push
            if(node.left!=null) q.add(new Pair(node.left,currLevel+1));
            if(node.right!=null) q.add(new Pair(node.right,currLevel+1));
        }
    }
    public static void preorder(Node N, int k, int currLevel){
        if(N==null) return;
        if(currLevel==k) System.out.print(N.val+" ");
        preorder(N.left,k,currLevel+1);
        preorder(N.right,k,currLevel+1);
    }
}
