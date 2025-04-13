package Recursion;

public class generate_parenthesis {
    public static void print(int open, int close, String s, int n){
        if(s.length()==2*n){
            System.out.print(s+" ");
            return;
        }
        if(open<n) print(open+1 ,close, s+"(", n);
        if(close<open) print(open, close+1, s+")", n);
    }
    public static void main(String[] args) {
        int n=3;
        print(0,0,"",n);
    }
}
