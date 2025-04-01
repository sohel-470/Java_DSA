package Recursion;

public class a_power_b {
    public static int power(int a, int b){ //TC = O(b)
        if(a==0) return 0;
        if(b==0) return 1;
        return a*power(a,b-1);
    }
    public static void main(String[] args) {
        int a=2, b=20;
        System.out.println(power(a,b));
    }
}
