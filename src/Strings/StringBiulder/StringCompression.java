package Strings.StringBiulder;

public class StringCompression {
    public static void main(String[] args) {
        String s = "aaaagggeeeccuuuudehh"+" ";
        char[] ch = s.toCharArray();
        String ans = "";
        int i=0, j=0;
        while(j<s.length()){
            if(ch[j]==ch[i]) j++;
            else {
                ans += ch[i];
                int freq = j-i;
                if(freq>1) ans += freq;
                i=j;
            }
        }
        System.out.println(ans);
    }
}
