import java.util.*;

public class LadoosAndBarfis {

    public static int maxLen(int arr[]){
        ArrayList<Integer> runs = new ArrayList<>();

        int count = 1;

        for(int i=1; i<arr.length; i++){
            if(arr[i] == arr[i-1]){
                count++;
            }
            else{
                runs.add(count);
                count=1;
            }
        }

        runs.add(count);

        int res = 2;
        for(int i=0; i<runs.size()-1; i++){
            res = Math.max(res, 2*Math.min(runs.get(i), runs.get(i+1)));
        }

        return res;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(maxLen(arr));
    }
}
