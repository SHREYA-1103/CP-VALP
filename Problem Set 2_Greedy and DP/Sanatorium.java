import java.util.*;

public class Sanatorium {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long b = sc.nextLong();
        long d = sc.nextLong();
        long s = sc.nextLong();

        long max = Math.max(b, Math.max(d,s));

        long missed = Math.max(0, max-1-b) + Math.max(0, max-1-d) + Math.max(0, max-1-s);

        System.out.println(missed);

        sc.close();
    }
}
