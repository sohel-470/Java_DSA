package Strings;

import java.util.Scanner;

public class printingSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        int n = s.length();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n+1; j++){
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
