package Recursion;

public class HCF {
    public static int hcf(int a, int b){ // TC= O[min(a,b)]
        for(int i=Math.min(a,b); i>=1; i--){
            if(a%i==0 && b%i==0) return i;
        }
        return 1;
    }
    public static void main(String[] args) {
        int a=120, b=150;
        System.out.println(hcf(a,b));
    }
}
