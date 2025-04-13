package Recursion;

public class removeCharacter {
    public static void remove(int i, char ch, String s, String ans){
        if(i==s.length()) {
            System.out.println(ans);
            return;
        }
        if(s.charAt(i)!=ch) ans+=s.charAt(i);
        remove(i+1,ch,s,ans);
    }
    public static void main(String[] args) {
        String s = "Sohel Mondal";
        char ch = 'l';
        remove(0,ch,s,"");
    }
}
