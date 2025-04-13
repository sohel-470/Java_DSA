package Recursion;

public class HCF_rec {
    public static int hcf(int a, int b){
        if(a==0) return b;
        return hcf(b%a,a);
    }
    public static void main(String[] args) {
        int a=3, b=41;
        System.out.println(hcf(a,b));
    }
}
