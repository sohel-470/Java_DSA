package Strings.StringBiulder;

public class toggleCharacters {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("physics WALLAH");
        int n = sb.length();
        for(int i=0; i<n; i++){
            int ascii = sb.charAt(i);
            if(ascii>=65 && ascii<=90){ //capital letters
                ascii = ascii+32;
                sb.setCharAt(i,(char)ascii);
            }
            else if(ascii>=97 && ascii<=122){ //small letters
                ascii = ascii-32;
                sb.setCharAt(i,(char)ascii);
            }
        }
        System.out.println(sb);
    }
}
