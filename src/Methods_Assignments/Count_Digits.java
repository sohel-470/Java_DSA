package Methods_Assignments;

import java.util.Scanner;
public class Count_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        System.out.println("No of Digits: " + digits(n));
        System.out.println("Square: " + n*n);
    }

    static int digits(int x){
        int count = 0;
        while(x!=0){
            x/=10;
            count++;
        }
        return count;
    }
}
