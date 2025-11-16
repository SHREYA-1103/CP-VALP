import java.util.*;

public class GoodArrays {

    public static void isGood(int arr[]){
        int n = arr.length;
        
        if(n == 1){
            System.out.println("NO");
            return;
        }

        int arr2[] = arr.clone();

        Arrays.sort(arr2);

        for(int i=1; i<n; i++){
            if(arr2[i] == arr2[i-1]){
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
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

            isGood(arr);
        }

        sc.close();
    }
}
