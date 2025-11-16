import java.util.*;

public class SweetEating {

    public static long[] minSweets(int arr[], int q){
        Arrays.sort(arr);

        int n = arr.length;

        for(int i=0; i<n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }

        long pref[] = new long[n+1];

        for(int i=1; i<=n; i++){
            pref[i] = pref[i-1] + arr[i-1];
        }

        return pref;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int q = sc.nextInt();

            int arr[] = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            long pref[] = minSweets(arr, q);

            while(q-- > 0){
                long x = sc.nextLong();

                if(pref[n] < x){
                    System.out.println("-1");
                    continue;
                }

                int l = 1;
                int r = n;
                int res = -1;

                while(l <= r){
                    int mid = (l+r)/2;
                    if(pref[mid] >= x){
                        res = mid;
                        r = mid-1;
                    }
                    else{
                        l = mid+1;
                    }
                }

                System.out.println(res);
            }
        }
    }
}
