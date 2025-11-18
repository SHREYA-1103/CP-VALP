import java.util.*;

public class ChatBan {

    public static long prefixSum(long k, long m){
        if(m <= k){
            return m*(m+1)/2;
        }
        else{
            long t = m-k;
            long firstPart = k*(k+1)/2;
            long secondPart = t*k-t*(t+1)/2;
            return firstPart+secondPart;
        }
    }

    public static long countMsgs(long k, long x){
        long total = k*k;

        long n = 2*k-1;

        if(x > total){
            return n;
        }

        long low = 1;
        long high = n;
        long res = n;

        while(low <= high){
            long mid = low + (high - low)/2;

            if(prefixSum(k, mid) >= x){
                res = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return res;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            long k = sc.nextLong();
            long x = sc.nextLong();

            System.out.println(countMsgs(k, x));
        }
    }
}
