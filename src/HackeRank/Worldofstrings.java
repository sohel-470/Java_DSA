package HackeRank;

import java.util.*;

public class Worldofstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        System.out.println(min(s));
    }
    static int min(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
            }
        }
        for (int l=3; l <=n; l++) {
            for (int i=0; i <= n-l; i++) {
                int j =i +l-1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                }
            }
        }
        for (int i=0; i<n; i++) {
            if (dp[0][i]) {
                c[i] = 0;
            } else {
                c[i] = Integer.MAX_VALUE;
                for (int j =0; j<i; j++) {
                    if (dp[j + 1][i] && c[j]+1<c[i]) {
                        c[i] = c[j]+1;
                    }
                }
            }
        }
        return c[n-1];
    }
}