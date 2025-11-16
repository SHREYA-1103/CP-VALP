import java.util.*;

public class ArrayBalancing{

    public static long minSum(long a[], long b[]){
        int n = a.length;
        
        long dp[][] = new long[n][2];

        dp[0][0] = 0;
        dp[0][1] = 1;

        for(int i=1; i<n; i++){
            dp[i][0] = Math.min(dp[i-1][0] + Math.abs(a[i] - a[i-1]) + Math.abs(b[i] - b[i-1]),
                                dp[i-1][1] + Math.abs(a[i] - b[i-1]) + Math.abs(b[i] - a[i-1]));
            
            dp[i][1] = Math.min(dp[i-1][0] + Math.abs(b[i] - a[i-1]) + Math.abs(a[i] - b[i-1]),
                                dp[i-1][1] + Math.abs(b[i] - b[i-1]) + Math.abs(a[i] - a[i-1]));
        }

        return Math.min(dp[n-1][0], dp[n-1][1]);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            long a[] = new long[n];
            long b[] = new long[n];

            for(int i=0; i<n; i++){
                a[i] = sc.nextLong();
            }

            for(int i=0; i<n; i++){
                b[i] = sc.nextLong();
            }

            System.out.println(minSum(a, b));
        }
    }
}