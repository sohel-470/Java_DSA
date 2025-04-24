package HackeRank;

import java.util.*;

public class aopurvmayllz {
    static final int MOD = 1000000007;
    static boolean[] isPrime;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxNum = 2 * n;
        precomputePrimes(2 * maxNum);

        int[] dp = new int[1 << maxNum];
        Arrays.fill(dp, -1);
        dp[0] = 1; // Base case: empty set has 1 way

        int result = countPairings(0, maxNum, dp);
        System.out.println(result);
    }
    static void precomputePrimes(int limit) {
        isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
    static int countPairings(int mask, int maxNum, int[] dp) {
        if (dp[mask] != -1) return dp[mask];

        int firstUnset = -1;
        for (int i = 1; i <= maxNum; i++) {
            if ((mask & (1 << (i - 1))) == 0) {
                firstUnset = i;
                break;
            }
        }
        if (firstUnset == -1) return dp[mask] = 1;

        int res = 0;
        for (int j = firstUnset + 1; j <= maxNum; j++) {
            if ((mask & (1 << (j - 1))) == 0 && isPrime[firstUnset + j]) {
                int newMask = mask | (1 << (firstUnset - 1)) | (1 << (j - 1));
                res = (res + countPairings(newMask, maxNum, dp)) % MOD;
            }
        }
        return dp[mask] = res;
    }
}