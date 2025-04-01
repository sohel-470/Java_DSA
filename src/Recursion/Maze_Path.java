package Recursion;

public class Maze_Path {
    public static int ways(int i, int j, int m, int n){
        if(i==m || j==n) return 1;
        return ways(i+1,j,m,n) + ways(i,j+1,m,n);
    }
    //more optimised as (m,n)-->(1,1) is same as (1,1)-->(m,n)
    public static int ways2(int m, int n){
        if(m==1 || n==1) return 1;
        return ways2(m-1,n) + ways2(m,n-1);
    }
    public static void main(String[] args) {
        int m=3, n=3;
        System.out.println(ways(1,1,m,n));
        System.out.println(ways2(m,n));
    }
}
