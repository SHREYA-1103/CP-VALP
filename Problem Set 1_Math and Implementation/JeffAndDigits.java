import java.util.*;

public class JeffAndDigits {

    public static void largestNumber(int arr[]){
        int n = arr.length;

        int count0 = 0;
        int count5 = 0;

        for(int i=0; i<n; i++){
            if(arr[i] == 0) count0++;
            else count5++;
        }

        if(count0 == 0){
            System.out.println("-1");
        }

        else if(count5 < 9){
            System.out.println("0");
        }

        else{
            int fivesToUse = count5 - (count5 % 9);
            StringBuilder sb = new StringBuilder();

            for(int i=0; i<fivesToUse; i++){
                sb.append('5');
            }
            
            for(int i=0; i<count0; i++){
                sb.append('0');
            }

            System.out.println(sb.toString());
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        largestNumber(arr);

        sc.close();
    }
}
