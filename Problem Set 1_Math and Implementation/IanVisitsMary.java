import java.util.*;

public class IanVisitsMary {

    public static long GCD(long a, long b){
        if(b == 0) return a;
        return GCD(b, a%b);
    }

    public static void minJumps(long a, long b){
        long gcd = GCD(a, b);
        
        if(gcd == 1){
            System.out.println(1);
            System.out.println(a + " " + b);
        }
        else{
            System.out.println(2);

            long x = 1;
            long y = (b > 1) ? b - 1: 1;
            while(GCD(x,y) != 1){
                x++;
                if(x >= a) x = 1;
                y--;
                if(y <= 0) y = b-1;
            }
            System.out.println(x + " " + y);
            System.out.println(a + " " + b);
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();

            minJumps(a, b);
        }
    }
}
