import java.util.*;

public class RudolfAndBallGame {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();

            int[] r = new int[m];
            char[] c = new char[m];

            for(int i = 0; i < m; i++){
                r[i] = sc.nextInt();
                c[i] = sc.next().charAt(0);
            }

            solve(n, m, x, r, c);
        }
    }

    public static void solve(int n, int m, int start, int[] r, char[] c){
        boolean[] dp = new boolean[n + 1];
        dp[start] = true;

        for(int i = 0; i < m; i++){
            dp = updateDP(n, dp, r[i], c[i]);
        }

        int count = 0;
        for(int i = 0; i < dp.length; i++){
            if(dp[i]) count++;
        }
        System.out.println(count);
        
        for(int i = 0; i < dp.length; i++){
            if(dp[i]) System.out.print(i + " ");
        }
        System.out.println();
    }

    public static boolean[] updateDP(int n, boolean[] dp, int dist, char dir){
        boolean[] next = new boolean[n + 1];

        for(int player = 1; player <= n; player++){
            if(!dp[player]) continue;

            // clockwise
            if(dir == '0' || dir == '?'){
                int nxt = player + dist;
                if(nxt > n) nxt -= n;
                next[nxt] = true;
            }

            // counterclockwise
            if(dir == '1' || dir == '?'){
                int nxt = player - dist;
                if(nxt <= 0) nxt += n;
                next[nxt] = true;
            }
        }

        return next;
    }
}
