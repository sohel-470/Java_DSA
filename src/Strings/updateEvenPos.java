package Strings;

public class updateEvenPos {
    public static void main(String[] args) {
        String s = "Physics Wallah  Skills";
        int n = s.length();
        String str = "";  //A new empty string is needed coz of immutability of strings
        for(int i=0; i<n; i++){
            if(i%2==0) str = str + 'a';
            else str = str + s.charAt(i);
        }
        System.out.println(str);
    }
}
