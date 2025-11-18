import java.util.*;

public class InterestingDrink {

    public static int upperBound(int prices[], int query){
        int l = 0;
        int r = prices.length-1;

        while(l <= r){
            int mid = l + (r - l)/2;
            if(prices[mid] <= query){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }

        return l;
    }

    public static String countShops(int prices[], int queries[]){
        int q = queries.length;

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<q; i++){
            int count = upperBound(prices, queries[i]);
            sb.append(count).append("\n");
        }

        return sb.toString();
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int prices[] = new int[n];

        for(int i=0; i<n; i++){
            prices[i] = sc.nextInt();
        }

        Arrays.sort(prices);

        int q = sc.nextInt();

        int queries[] = new int[q];

        for(int i=0; i<q; i++){
            queries[i] = sc.nextInt();
        }

        System.out.println(countShops(prices, queries));
    }
}
