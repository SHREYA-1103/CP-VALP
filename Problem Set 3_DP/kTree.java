import java.util.*;

public class kTree {
    
    static final long MOD = 1000000007;

    public static long countWays(int n, int k) {
        long[] dp = new long[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            long sum = 0;
            for (int w = 1; w <= k && w <= i; w++) {
                sum = (sum + dp[i - w]) % MOD;
            }
            dp[i] = sum;
        }
        
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int d = sc.nextInt();

        long total = countWays(n, k);
        long withoutD = countWays(n, d - 1);

        long ans = (total - withoutD) % MOD;
        if (ans < 0) ans += MOD;

        System.out.println(ans);
    }
}
