package Trees;

import java.util.ArrayList;
import java.util.List;

public class PathSum_II {
    public static List<Integer> copy(List<Integer> arr){
        List<Integer> brr = new ArrayList<>();
        for(int ele:arr) brr.add(ele);
        return brr;
    }
    public static void traverse(Node root,int target,List<Integer> arr,List<List<Integer>> ans){
        if(root==null) return;
        if(root.left==null && root.right==null){ //leaf node
            if(target==root.val){
                arr.add(root.val);
                ans.add(arr);
                return;
            }
        }
        arr.add(root.val);
        List<Integer> arr1 = copy(arr);
        List<Integer> arr2 = copy(arr);
        traverse(root.left,target-root.val,arr1,ans);
        traverse(root.right,target-root.val,arr2,ans);
    }
    public static List<List<Integer>> pathSum(Node root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        traverse(root,targetSum,arr,ans);
        return ans;
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(4);
        Node c = new Node(8);
        Node d = new Node(11);
        Node e = new Node(13);
        Node f = new Node(4);
        Node g = new Node(7);
        Node h = new Node(2);
        Node i = new Node(5);
        Node j = new Node(1);

        a.left=b; a.right=c;
        b.left=d;
        c.left=e; c.right=f;
        d.left=g; d.right=h;
        f.left=i; f.right=j;

        System.out.println(pathSum(a,22));
    }
}
