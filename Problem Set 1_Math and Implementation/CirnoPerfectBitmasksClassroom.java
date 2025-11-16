import java.util.*;

public class CirnoPerfectBitmasksClassroom {

    public static long minY(long x){
        if(x == 1) return 3;
        
        if((x & (x-1)) == 0) return x+1;

        return x & -x;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            long x = sc.nextLong();

            System.out.println(minY(x));
        }

        sc.close();
    }
}
