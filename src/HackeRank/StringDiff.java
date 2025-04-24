package HackeRank;
import java.util.*;

public class StringDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < t; i++) {
            String s1 = sc.next();
            String s2 = sc.next();
            int total = 0;
            for (int j = 0; j < s1.length(); j++) {
                int pos1 = s1.charAt(j) - 'a' + 1;
                int pos2 = s2.charAt(j) - 'a' + 1;
                total += Math.abs(pos1 - pos2);
                }
            System.out.println(total);
            }
        sc.close();
    }
}
