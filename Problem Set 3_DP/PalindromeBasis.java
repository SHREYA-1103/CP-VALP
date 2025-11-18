import java.util.*;

public class PalindromeBasis {

    static final int MAXN = 40000;
    static final int MOD = 1000000007;
    static List<Integer> pal = new ArrayList<>();
    static long[] dp = new long[MAXN + 1];

    public static boolean isPal(int x) {
        int original = x, rev = 0;
        while (x > 0) {
            rev = rev * 10 + (x % 10);
            x /= 10;
        }
        return rev == original;
    }

    public static void precompute() {
        for (int i = 1; i <= MAXN; i++) {
            if (isPal(i)) pal.add(i);
        }

        dp[0] = 1;

        for (int p : pal) {
            for (int s = p; s <= MAXN; s++) {
                dp[s] = (dp[s] + dp[s - p]) % MOD;
            }
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        precompute();

        int t = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            sb.append(dp[n]).append("\n");
        }

        System.out.print(sb);
    }
}
