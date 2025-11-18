import java.util.*;

public class TenzingAndBalls {

    public static int countMaxBalls(int n, int color[]){
        int[] next = new int[n];
        Arrays.fill(next, -1);

        int[] last = new int[n + 1];
        Arrays.fill(last, -1);

        for(int i=0; i<n; i++){
            last[color[i]] = i;
        }

        int dp[] = new int[n+1];

        for(int i=n-1; i>=0; i--){
            int best = dp[i+1];

            int colorVal = color[i];
            int end = last[colorVal];

            if (end > i) {
                int len = end - i + 1;
                best = Math.max(best, len + dp[end + 1]);
            }

            dp[i] = best;
        }

        return dp[0];
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int color[] = new int[n];

            for(int i=0; i<n; i++){
                color[i] = sc.nextInt();
            }

            System.out.println(countMaxBalls(n, color));
        }
    }
}
