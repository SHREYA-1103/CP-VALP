import java.util.*;

public class AwoosFavoriteProblem {

    public static boolean canTransform(String s, String s_mod){
        int countS[] = new int[3];
        int countSMOD[] = new int[3];

        for(int i=0; i<s.length(); i++){
            countS[s.charAt(i) - 'a']++;
            countSMOD[s_mod.charAt(i) - 'a']++;
        }

        for(int i=0; i<3; i++){
            if(countS[i] != countSMOD[i]) return false;
        }

        StringBuilder S_sb = new StringBuilder();
        StringBuilder SMOD_sb = new StringBuilder();

        for(char c : s.toCharArray()) if(c != 'b') S_sb.append(c);

        for(char c : s_mod.toCharArray()) if(c != 'b') SMOD_sb.append(c);

        if(!S_sb.toString().equals(SMOD_sb.toString())) return false;

        int posSMOD = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a'){
                while(s_mod.charAt(posSMOD) != 'a') posSMOD++;
                if(i > posSMOD) return false;
                posSMOD++;
            }
        }

        posSMOD = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'c'){
                while(s_mod.charAt(posSMOD) != 'c') posSMOD++;
                if(i < posSMOD) return false;
                posSMOD++;
            }
        }

        return true;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            String s_mod = sc.next();

            System.out.println(canTransform(s, s_mod) ? "YES" : "NO");
        }
    }
}
