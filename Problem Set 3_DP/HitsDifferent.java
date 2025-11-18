import java.util.*;

public class HitsDifferent {
    
    static long[] dp;

    public static void build(int n) {
        dp = new long[n + 1];

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + (6L * i - 3);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int max = 0;

        long[] arr = new long[t];

        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextLong();
            max = Math.max(max, (int) arr[i]);
        }

        build(max);

        StringBuilder sb = new StringBuilder();

        for (long n : arr) {
            sb.append(n * n + dp[(int) n]).append("\n");
        }
        
        System.out.print(sb);
    }
}
