import java.util.*;

public class BuildPermutation {

    public static void findPermutation(int n){
        int permut[] = new int[n];
        Arrays.fill(permut, -1);

        boolean ok = true;

        for(int i=n-1; i>=0;){
            int k = (int) Math.sqrt(i);
            if (1L * k * k < i) k++;

            int sq = k*k;

            int l = sq-i;

            if(l < 0 || l >= n){
                ok = false;
                break;
            }

            for(int j=l; j<=i; j++){
                int val = sq - j;
                if(val < 0 || val >= n || permut[j] !=-1){
                    ok = false;
                    break;
                }
                permut[j] = val;
            }

            if(!ok) break;

            i = l-1;
        }

        if(!ok){
            System.out.println("-1");
            return;
        }

        for(int i=0; i<n; i++){
            System.out.print(permut[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            findPermutation(n);
        }
    }
}
