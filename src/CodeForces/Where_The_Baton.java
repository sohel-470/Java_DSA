package CodeForces;
import java.util.Scanner;

public class Where_The_Baton {
    public static boolean isPossible(String s, String target) {
        int i = 0, j = 0;
        while (i < s.length() && j < target.length()) {
            if (s.charAt(i) == target.charAt(j)) j++;
            i++;
        }
        return j == target.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of test cases: ");
        int t = Integer.parseInt(sc.nextLine());
        String target = "baton";
        while (t > 0) {
            System.out.print("Enter String: ");
            String s = sc.nextLine();
            if (isPossible(s, target)) System.out.println("Yes");
            else System.out.println("No");
            t--;
        }
    }
}
