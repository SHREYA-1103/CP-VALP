import java.util.*;

public class MikeAndGCDProblem {
    
    public static long minOperations(int n, long[] a) {
        long g = 0;
        for (int i = 0; i < n; i++) g = gcd(g, a[i]);
        if (g > 1) return 0;

        long ops = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) continue;
            if (i + 1 < n && a[i + 1] % 2 == 1) {
                ops++;
                i++;
            } else {
                ops += 2;
            }
        }
        return ops;
    }

    static long gcd(long x, long y) {
        while (y != 0) {
            long t = x % y;
            x = y;
            y = t;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();
        System.out.println("YES");
        System.out.println(minOperations(n, a));
    }
}
