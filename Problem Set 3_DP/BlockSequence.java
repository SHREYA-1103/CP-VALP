import java.util.*;

public class BlockSequence {

    public static int minDeletions(int arr[], int n){
        int dp[] = new int[n+1];
        dp[n] = 0;

        for(int i=n-1; i>= 0; i--){
            int best = dp[i+1];

            int L = arr[i];

            if(i+L < n){
                int take = (L+1);
                if(i+L+1 <= n) take += dp[i+L+1];
                if(take > best) best = take;
            }

            dp[i] = best;
        }

        return n-dp[0];
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(minDeletions(arr,n));
        }
    }
}
