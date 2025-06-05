package Methods_Assignments;

public class Reverse_String {
    static String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "Sohel";
        System.out.println(reverse(s));
    }
}
