import java.util.*;

public class SendingSequenceOverNetwork {
    
    public static boolean check(int[] b) {
        int n = b.length;
        for (int i = 0; i < n; i++) {
            int L = b[i];
            if (L == 1) continue;

            boolean leftOK = true, rightOK = true;

            if (i + L > n) leftOK = false;
            else {
                for (int k = 0; k < L; k++) {
                    if (b[i + k] != L - k) {
                        leftOK = false;
                        break;
                    }
                }
            }

            if (i - L + 1 < 0) rightOK = false;
            else {
                for (int k = 0; k < L; k++) {
                    if (b[i - k] != L - k) {
                        rightOK = false;
                        break;
                    }
                }
            }

            if (!leftOK && !rightOK) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();
            sb.append(check(b) ? "YES\n" : "NO\n");
        }
        System.out.print(sb);
    }
}
