import java.util.*;

public class LLPS {

    public static String llps(String s){
        char maxChar = 'a';
        for(char c: s.toCharArray()){
            if(c > maxChar) maxChar = c;
        }

        StringBuilder sb = new StringBuilder();

        for(char c: s.toCharArray()){
            if(c == maxChar) sb.append(c);
        }

        return sb.toString();
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        System.out.println(llps(s));
    }
}
