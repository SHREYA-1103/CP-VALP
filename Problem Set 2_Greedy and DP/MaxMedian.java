import java.util.*;

public class MaxMedian {

    public static long findMax(long arr[], int n, long k){
        Arrays.sort(arr);
        int midIdx = n/2;
        long low = arr[midIdx];
        long high = low+k+1;

        while(low < high){
            long mid = low + (high - low)/2;
            long needed = 0;

            for(int i=midIdx; i<n; i++){
                if(arr[i] < mid) needed += mid-arr[i];
                if(needed > k) break;
            }

            if(needed <= k){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }   

        return low - 1;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = sc.nextLong();
        long a[] = new long[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextLong();
        }

        System.out.println(findMax(a, n, k));
    }       
}
