package Strings;

import java.util.Scanner;
public class whyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //printing Strings using 'Char' array
        char[] arr = {'R', 'a', 'g', 'h', 'a', 'v'};
        for(char ele : arr){
            System.out.print(ele + "");
        }
        System.out.println();

        //printing Strings
        String str = "Raghav is a doctor";
        System.out.println(str);

        //taking strings from user and printing
        System.out.println("Enter line 1: ");
        String str1 = sc.next();  //using next() --> only takes the first word of the sentence
        System.out.println(str1);

        System.out.println("Enter line 2: ");
        String abc = sc.nextLine();  //using nextLine() --> takes the whole sentence
        System.out.println(abc);

    }
}
