package Recursion;

public class a_power_b_logarithmic {
    public static int pow(int a, int b){ // TC = O(log b)
        if(a==0) return 0;
        if(b==0) return 1;
        int ans = pow(a,b/2);
        if(b%2==0) return ans*ans;
        else return ans*ans*a;
    }
    public static void main(String[] args) {
        int a=2, b=29;
        System.out.println(pow(a,b));
    }
}