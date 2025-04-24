package CodeForces;
import java.util.*;
public class bobValentineDay {
    static List<Integer>[] tree;
    static int[] parent, depth;
    static boolean[] visited;

    public static void dfs(int node, int par, int d) {
        parent[node] = par;
        depth[node] = d;
        visited[node] = true;
        for (int neighbor : tree[node]) {
            if (!visited[neighbor]) {
                dfs(neighbor, node, d + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), q = sc.nextInt();

        tree = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) tree[i] = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
            tree[u].add(v);
            tree[v].add(u);
        }

        parent = new int[n + 1];
        depth = new int[n + 1];
        visited = new boolean[n + 1];
        dfs(1, -1, 0); // root the tree at node 1

        while (q-- > 0) {
            int m = sc.nextInt();
            int[] list = new int[m];
            int maxDepth = -1;
            int target = -1;

            for (int i = 0; i < m; i++) {
                list[i] = sc.nextInt();
                if (depth[list[i]] > maxDepth) {
                    maxDepth = depth[list[i]];
                    target = list[i];
                }
            }

            // Build path from root (1) to target
            Set<Integer> pathSet = new HashSet<>();
            int cur = target;
            while (cur != -1) {
                pathSet.add(cur);
                cur = parent[cur];
            }

            Set<Integer> extendedPath = new HashSet<>(pathSet);
            for (int node : pathSet) {
                extendedPath.addAll(tree[node]);
            }

            boolean valid = true;
            for (int node : list) {
                if (!extendedPath.contains(node)) {
                    valid = false;
                    break;
                }
            }

            System.out.println(valid ? "YES" : "NO");
        }
    }
}
