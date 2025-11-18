import java.util.*;

public class LexicographicallyMaxSubSeq {

    public static String findSubseq(String s){
        StringBuilder res=  new StringBuilder();

        char maxChar = 0;

        for(int i=s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            if(c >= maxChar){
                res.append(c);
                maxChar = c;
            }
        }

        res.reverse();

        return res.toString();
    }
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String s = sc.next();

        System.out.println(findSubseq(s));
    }
}
