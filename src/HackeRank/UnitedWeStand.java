package HackeRank;

import java.util.*;

public class UnitedWeStand {
    static class Find {
        private int[] p;
        private int[] r;
        public Find(int size) {
            p = new int[size + 1];
            r = new int[size + 1];
            for (int i = 1; i <= size; i++) {
                p[i] = i;
                r[i] = 1;
            }
        }
        public int find(int x) {
            if (p[x] != x) {
                p[x] = find(p[x]);
            }
            return p[x];
        }
        public void union(int x, int y) {
            int rX = find(x);
            int rY = find(y);

            if (rX != rY) {
                if (r[rX] > r[rY]) {
                    p[rY] = rX;
                } else if (r[rX] < r[rY]) {
                    p[rX] = rY;
                } else {
                    p[rY] = rX;
                    r[rX]++;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Find uf = new Find(a);

        for (int i = 0; i < b; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            uf.union(u, v);
        }
        Set<Integer> roots = new HashSet<>();
        for (int i = 1; i <= a; i++) {
            roots.add(uf.find(i));
        }
        System.out.println(roots.size());
    }
}
