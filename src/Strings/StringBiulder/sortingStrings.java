package Strings.StringBiulder;

import java.util.Arrays;

public class sortingStrings {
    public static void main(String[] args) {
        String s = "skills";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for(char ele:ch){
            System.out.print(ele);
        } //printing sorted char array

        System.out.println();

        StringBuilder sb = new StringBuilder("hysics");
        char[] arr = sb.toString().toCharArray();
        Arrays.sort(arr);
        for(char ele:arr){
            System.out.print(ele);
        } //printing sorted char array
    }
}
