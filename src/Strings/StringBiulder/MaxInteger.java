package Strings.StringBiulder;

public class MaxInteger {
    public static void main(String[] args) {
        String[] str = {"47", "75", "0078", "78"};
        String max = str[0];
        for(int i=1; i<str.length; i++){
            max = maxString(str[i], max);
        }
        System.out.println(max);
    }
    static String maxString(String x, String y){
        String a = purify(x), b = purify(y);  //to eliminate leading zeroes
        if(a.length()>b.length()) return x;
        if(a.length()<b.length()) return y;
        for(int i=0; i<a.length(); i++){   //length of Strings same
            if(a.charAt(i)!=b.charAt(i)){
                if(a.charAt(i)>b.charAt(i)) return x;  //we can compare characters as well (same as ASCII)
                else return y;
            }
        }
        if(x.length()>y.length()) return x;  // if(0078, 78), return 0078
        return y;
    }
    static String purify(String x){
        for(int i=0; i<x.length(); i++){
            if(x.charAt(i)!=0) return x.substring(i);
        }
        return x;   //if all zero eg. 0000
    }
}
