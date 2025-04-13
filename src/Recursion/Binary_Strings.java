package Recursion;
//Binary Strings of length 'n' without consecutive '1's
public class Binary_Strings {
    public static void binaryString(String s, int n){
        int m=s.length();
        if(m==n){
            System.out.println(s+" ");
            return;
        }
        if(m==0 || s.charAt(m-1)== '0') { //for printing all possible binary combinations, just eliminate this if-else statements.
            binaryString(s+'1',n);
            binaryString(s+'0',n);
        }
        else binaryString(s+'0',n); //for printing all possible binary combinations, just eliminate this if-else statements.
    }
    public static void main(String[] args) {
        int n=4;
        binaryString("",n);
    }
}
