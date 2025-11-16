import java.util.*;

public class GrasshopperInALine {

    public static void minMoves(int x, int k){
        if(x % k != 0){
            System.out.println("1");
            System.out.println(x);
        }
        else{
            System.out.println("2");
            System.out.println(x-1 + " " + 1);
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int x = sc.nextInt();
            int k = sc.nextInt();

            minMoves(x, k);
        }

        sc.close();
    }
}
