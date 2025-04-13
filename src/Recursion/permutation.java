package Recursion;

public class permutation {
    public static void printpermutation(String ans,String s){
        if(s.length()==0){
            System.out.print(ans+" ");
            return;
        }
        for(int j=0; j<s.length(); j++){
            char ch= s.charAt(j);
            String left = s.substring(0,j);
            String right = s.substring(j+1);
            printpermutation(ans+ch,left+right);
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        printpermutation("", s);
    }
}
