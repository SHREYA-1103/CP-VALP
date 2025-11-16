import java.util.*;

public class AdityaAndPEReport {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int c = sc.nextInt();
            int q = sc.nextInt();

            String s = sc.next();

            long len[] = new long[c+1];
            len[0] = n;
            long ops[][] = new long[c][2];

            for(int i=0; i<c; i++){
                long l = sc.nextLong();
                long r = sc.nextLong();

                ops[i][0] = l;
                ops[i][1] = r;
                len[i+1] = len[i] + (r-l+1);
            }

            for(int qidx=0; qidx<q; qidx++){
                long k = sc.nextLong();
                for(int i=c; i>0; i--){
                    if(k <= len[i-1]) continue;
                    long l = ops[i-1][0];
                    long r = ops[i-1][1];
                    k = l + (k - len[i-1]) - 1;
                }
                System.out.println(s.charAt((int)(k-1)));
            }
        }

        sc.close();
    }
}
