import java.util.*;

public class KandarpAndPuzzleWorkshop {

    public static int countMovesToMakeEqual(int a, int b, int c, int d){
        long x = 1L * a * d;
        long y = 1L * b * c;
        
        if(x == y) return 0;

        if(a == 0 || c == 0) return 1;

        if(x != 0 && y % x == 0) return 1;
        if(y != 0 && x % y == 0) return 1;

        return 2;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            System.out.println(countMovesToMakeEqual(a,b,c,d));
        }

        sc.close();
    }
}
