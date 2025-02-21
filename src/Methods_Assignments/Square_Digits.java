package Methods_Assignments;

import java.util.Scanner;
public class Square_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        sum_digits(n);
    }

    static void sum_digits(int x){
        int sum = 0, sq = 1;
        while(x!=0){
            int dig=x%10;   // Adds last digit of n to sum
            sq= dig*dig;
            sum+=sq;
            x/=10;          // Removes last digit of n
        }
        System.out.println("Sum of squares of Digits: "+sum);
    }
}
