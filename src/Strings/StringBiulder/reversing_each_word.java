package Strings.StringBiulder;

public class reversing_each_word {
    static void reverse(StringBuilder sb, int i, int j) {  //here j is included
        while (i <= j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++; j--;
        }
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Physics Wallah Skills");
        sb.append(' ');  //space is needed at last for reversing last word
        int n = sb.length();
        int i=0, j=0;
        while (j < n) {
            if (sb.charAt(j) != ' ') j++;  //skipping characters
            else {  //reverse when ' ' found
                reverse(sb, i, j-1);
                i=j+1; j++;  // j=i
            }
        }
        System.out.println(sb);
    }
}
