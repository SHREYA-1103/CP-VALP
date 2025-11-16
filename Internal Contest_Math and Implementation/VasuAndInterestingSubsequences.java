import java.util.*;

public class VasuAndInterestingSubsequences {

    public static int maxLenOfInterestingSubseq(int arr[]){
        Arrays.sort(arr);

        int countNonPos = 0;

        while(countNonPos < arr.length && arr[countNonPos] <= 0){
            countNonPos++;
        }

        if(countNonPos == arr.length) return countNonPos;

        int minGap = Integer.MAX_VALUE;

        for(int i=1; i<countNonPos; i++){
            minGap = Math.min(Math.abs(arr[i] - arr[i-1]), minGap);
        }

        if(arr[countNonPos] <= minGap) return countNonPos+1;

        return countNonPos;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int arr[] = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            System.out.println(maxLenOfInterestingSubseq(arr));
        }

        sc.close();
    }
}
