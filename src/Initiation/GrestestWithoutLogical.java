package Initiation;

import java.util.Scanner;
public class GrestestWithoutLogical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 nos.:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>=b){
            if(a>=c) System.out.println(a + " is greatest.");
            else System.out.println(c + " is greatest.");
        }
        else{
            if(b>=c) System.out.println(b + " is greatest.");
            else System.out.println(c + " is greatest.");
        }
    }
}