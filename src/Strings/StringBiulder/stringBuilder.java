package Strings.StringBiulder;

import java.util.Scanner;

public class stringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Syntax
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        //taking user input
        StringBuilder tb = new StringBuilder(sc.nextLine());
        System.out.println(tb);
    }
}
