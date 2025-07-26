package Trees;

public class DiameterOfTree {
    public static int levels(Node root,int[] dia){
        if(root==null) return 0;
        int leftLevel = levels(root.left,dia);
        int rightLevel = levels(root.right,dia);
        dia[0] = Math.max(dia[0],leftLevel+rightLevel);
        return 1 + Math.max(leftLevel,rightLevel);
    }
    public static int diameterOfBinaryTree(Node root) {
        int[] dia = {0};
        levels(root,dia);
        return dia[0];
    }
    public static void main(String[] args) {
        
    }
}
