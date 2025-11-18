import java.util.*;

public class ABBB {

    public static int shortestLength(String s){
        Stack<Character> st = new Stack<>();

        for(char c: s.toCharArray()){
            if(!st.isEmpty()){
                char top = st.peek();

                if((top == 'A' && c == 'B') || (top == 'B' && c == 'B')){
                    st.pop();
                    continue;
                }
            }
            st.push(c);
        }

        return st.size();
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            String s = sc.next();
            System.out.println(shortestLength(s));
        }
    }
}
