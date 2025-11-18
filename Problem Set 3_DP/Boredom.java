import java.util.*;

public class Boredom {
    
    public static long maxPoints(int[] a) {
        int max = 0;
        for (int x : a) max = Math.max(max, x);

        long[] freq = new long[max + 1];
        for (int x : a) freq[x]++;

        long[] dp = new long[max + 1];
        dp[1] = freq[1];

        for (int i = 2; i <= max; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + freq[i] * i);
        }

        return dp[max];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        
        System.out.println(maxPoints(a));
    }
}
