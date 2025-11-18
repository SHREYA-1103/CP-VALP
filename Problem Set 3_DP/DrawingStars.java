import java.util.*;

public class DrawingStars {
    static int n, m;
    static char[][] g;
    static boolean[][] mark;

    public static boolean in(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }

    public static ArrayList<int[]> findStars() {
        ArrayList<int[]> res = new ArrayList<>();
        mark = new boolean[n][m];

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                if (g[i][j] == '*') {
                    int sz = 1;
                    while (true) {
                        if (in(i - sz, j) && in(i + sz, j) &&
                            in(i, j - sz) && in(i, j + sz) &&
                            g[i - sz][j] == '*' &&
                            g[i + sz][j] == '*' &&
                            g[i][j - sz] == '*' &&
                            g[i][j + sz] == '*') sz++;
                        else break;
                    }
                    sz--;
                    if (sz > 0) {
                        res.add(new int[]{i + 1, j + 1, sz});
                        mark[i][j] = true;
                        for (int k = 1; k <= sz; k++) {
                            mark[i - k][j] = true;
                            mark[i + k][j] = true;
                            mark[i][j - k] = true;
                            mark[i][j + k] = true;
                        }
                    }
                }
            }
        }

        return res;
    }

    public static boolean validate() {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (g[i][j] == '*' && !mark[i][j])
                    return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        g = new char[n][m];
        for (int i = 0; i < n; i++) g[i] = sc.next().toCharArray();

        ArrayList<int[]> ans = findStars();

        if (!validate()) {
            System.out.println("-1");
            return;
        }

        System.out.println(ans.size());
        for (int[] r : ans) System.out.println(r[0] + " " + r[1] + " " + r[2]);
    }
}