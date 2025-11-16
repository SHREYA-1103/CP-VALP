import java.util.*;

public class MukhammadaliAndSmoothArray {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            long a[] = new long[n];
            long c[] = new long[n];

            for(int i=0; i<n; i++){
                a[i] = sc.nextLong();
            }

            long total = 0;
            for(int i=0; i<n; i++){
                c[i] = sc.nextLong();
                total += c[i];
            }

            long dp[] = new long[n];

            long best = 0;

            for(int i=0; i<n; i++){
                dp[i] = c[i];
                for(int j=0; j<i; j++){
                    if(a[j] <= a[i]){
                        dp[i] = Math.max(dp[i], dp[j]+c[i]);
                    }
                }
                best = Math.max(best, dp[i]);
            }

            long ans = total-best;
            
            System.out.println(ans);
        }
    }
}
