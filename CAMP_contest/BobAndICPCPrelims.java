import java.util.*;

public class BobAndICPCPrelims {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int arr[] = new int[n];

            HashMap<Integer, Integer> firstOccurrence = new HashMap<>();
            HashMap<Integer, Integer> lastOccurrence = new HashMap<>();

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
                if(!firstOccurrence.containsKey(arr[i])){
                    firstOccurrence.put(arr[i], i);
                }
                lastOccurrence.put(arr[i], i);
            }

            boolean found = false;

            for(int key: firstOccurrence.keySet()){
                if(lastOccurrence.get(key) - firstOccurrence.get(key) >= 2){
                    found = true;
                    break;
                }
            }

            System.out.println(found ? "YES" : "NO");
        }
    }
}
