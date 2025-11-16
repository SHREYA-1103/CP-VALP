import java.util.*;

public class DoraemonsGadget {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int arr1[] = new int[n];

            for(int i=0; i<n; i++){
                arr1[i] = sc.nextInt();
            }

            long arr2[] = new long[n];
            arr2[0] = arr1[0];

            for (int i = 1; i < n; i++) {
                long prev = arr2[i-1];
                int curr = arr1[i];
                
                if (curr % prev == 0 || prev % curr == 0) {
                    arr2[i] = curr;
                } else {
                    arr2[i] = prev;
                }
            }
            
            for (int i = 0; i < n; i++) 
                System.out.print(arr2[i] + " ");
            System.out.println();
        }
    }
}
