import java.util.*;

public class SymmetricDiyaPattern{

    public static int findGoodCount(int n, int k){
        int res = 0;

        for(int i=0; i<=n; i++){
            int left = (i+k-1)/k;
            int right = ((n-i)+k-1)/k;
            res = Math.max(res, left+right);
        }

        return res;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            System.out.println(findGoodCount(n, k));
        }
    }
}