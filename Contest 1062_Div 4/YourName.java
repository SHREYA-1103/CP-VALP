import java.util.*;

public class YourName {

    public static String canBeRearranged(String s, String t){
        if(s.length() != t.length()) return "NO";
        
        HashMap<Character, Integer> freq = new HashMap<>();

        for(char c: s.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }

        for(char c: t.toCharArray()){
            if(!freq.containsKey(c)) return "NO";
            else{
                int val = freq.get(c);
                freq.remove(c);
                if(val > 1) freq.put(c, val-1);
            }
        }

        return "YES";
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            String name = sc.next();

            System.out.println(canBeRearranged(s, name));
        }
    }
}
