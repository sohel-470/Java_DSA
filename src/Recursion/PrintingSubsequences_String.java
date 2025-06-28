package Recursion;

public class PrintingSubsequences_String {
    static void printSubsequence(String s, StringBuilder sb, int idx){
        int n = s.length();
        if(idx==n){
            System.out.println(sb);
            return;
        }
        char ch = s.charAt(idx);
        sb.append(ch);
        printSubsequence(s,sb,idx+1);//take the idx element into the subsequence
        sb.deleteCharAt(sb.length()-1);//remove the last element
        printSubsequence(s,sb,idx+1);//not take the idx element into the subsequence
    }
    public static void main(String[] args) {
        String s = "soh";
        StringBuilder sb = new StringBuilder();
        printSubsequence(s,sb,0);
    }
}
