import java.util.*;

public class SkiResort {

    public static long countWays(int temp[], int k, int q){
        long count = 0;

        int n = temp.length;
        int len = 0;

        for(int i=0; i<n; i++){
            if(temp[i] <= q){
                len++;
            }
            else{
                if(len >= k){
                    count+=(long)(len-k+1)*(len-k+2)/2;
                }
                len = 0;
            }
        }

        if(len >= k){
            count+=(long)(len-k+1)*(len-k+2)/2;
        }

        return count;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int q = sc.nextInt();

            int arr[] = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            System.out.println(countWays(arr, k, q));
        }
    }
}
