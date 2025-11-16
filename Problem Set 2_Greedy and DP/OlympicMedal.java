import java.util.*;

public class OlympicMedal {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double maxR1 = 0;

        for(int i=0; i<n; i++){
            maxR1 = Math.max(maxR1, sc.nextDouble());
        }

        int m = sc.nextInt();
        double maxP1 = 0;

        for(int i=0; i<m; i++){
            maxP1 = Math.max(maxP1, sc.nextDouble());
        }

        int k = sc.nextInt();

        double minP2 = Double.MAX_VALUE;

        for(int i=0; i<k; i++){
            minP2 = Math.min(minP2, sc.nextDouble());
        }

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double num = maxP1 * B;
        double den = num + A*minP2;
        double ratio = num/den;
        double r2 = maxR1*Math.sqrt(ratio);

        System.out.println(String.format("%.12f", r2));
    }
}
