import java.util.*;

public class Tetrahedron {
    
    static long MOD = 1000000007L;

    public static int waysToReturn(int n){
        long d = 1;
        long abc = 0;

        for(int step=1; step<=n; step++){
            long newD = (3*abc)%MOD;
            long newABC = (d+2*abc)%MOD;
            d = newD;
            abc = newABC;
        }

        return (int)d;
    }

    public static void main(String args[]){
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(waysToReturn(n));
    }
}
