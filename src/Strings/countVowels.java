package Strings;

public class countVowels {
    public static void main(String[] args) {
        String str = "Sohel Mondal is a student";
        int count = 0;
        for(int i=0; i<str.length(); i++){
            String s = "aeiouAEIOU";
            for(int j=0; j<s.length(); j++) {
                if (str.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
