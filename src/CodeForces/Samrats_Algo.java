package CodeForces;

import java.util.*;

public class Samrats_Algo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter No. of test-cases");
        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            solve(a);
            t--;
        }
        scanner.close();
    }

    private static void solve(int[] a) {
        int n = a.length;
        long minScore = Long.MAX_VALUE;
        int bestX = 0;
        for (int x = 0; x <= 1023; x++) {
            int[] transformed = new int[n];
            for (int i = 0; i < n; i++) {
                transformed[i] = a[i] ^ x;
            }
            long score = calcScore(transformed);
            if (score < minScore) {
                minScore = score;
                bestX = x;
            }
        }

        System.out.println(minScore + " " + bestX);
    }

    private static long calcScore(int[] array) {
        long score = 0;
        while (true) {
            int oddCount = 0;
            boolean allZero = true;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 0) allZero = false;
                if (array[i] % 2 != 0) oddCount++;
                array[i] /= 2;
            }
            if (allZero) break;
            score += oddCount;
        }
        return score;
    }
}