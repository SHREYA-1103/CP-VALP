import java.util.*;

public class GeorgeAndJob {
    
    public static long solve(int n, int m, int k, long[] p) {
        long[] pre = new long[n + 1];

        for (int i = 1; i <= n; i++) pre[i] = pre[i - 1] + p[i];

        long[][] dp = new long[n + 1][k + 1];

        for (int i = m; i <= n; i++) {
            long blockSum = pre[i] - pre[i - m];
            for (int j = 1; j <= k; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i - m][j - 1] + blockSum);
            }
        }

        return dp[n][k];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        long[] p = new long[n + 1];

        for (int i = 1; i <= n; i++) p[i] = sc.nextLong();
        
        System.out.println(solve(n, m, k, p));
    }
}
