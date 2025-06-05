package Prefix_Sum;

public class MinPenaltyforShop {
    static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static int bestClosingTime(String s) {
        int n = s.length();
        int[] pre = new int[n + 1]; //prefix count of N
        int[] suff = new int[n + 1]; //suffix count of Y
        int[] penalty = new int[n + 1];
        pre[0] = 0;
        suff[n] = 0;
        int countN = 0, countY = 0;
        for (int i = 1; i <= n; i++) {
            if (s.charAt(i - 1) == 'N') countN++;
            pre[i] = countN;
        }
        System.out.println("Prefix count of N:");
        print(pre);
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == 'Y') countY++;
            suff[i] = countY;
        }
        System.out.println("Suffix count of Y:");
        print(suff);
        int min = Integer.MAX_VALUE, idx = -1;
        for (int i = 0; i <= n; i++) {
            penalty[i] = pre[i] + suff[i];
            if (penalty[i] < min) {
                min = penalty[i];
                idx = i;
            }
        }
        System.out.println("Penalty:");
        print(penalty);
        return idx;
    }
    public static void main(String[] args) {
        String s = "YYNYNNY";
        System.out.println("Min Index: "+bestClosingTime(s));
    }
}
