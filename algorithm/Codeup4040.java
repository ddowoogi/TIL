package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Codeup4040 {
    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n+1][m+1];
        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j+1] = s.charAt(j) == 'O' ? 1 : 0;
            }
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= m; j++) {
                if (arr[i][j] == 0) continue;
                arr[i][j] += arr[i+1][j];
            }
        }

        st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int total = 0;
        while (s<t) {
            total++;
            int max = 0;
            for (int j = 1; j <= m; j++) {
                max = Math.max(max, arr[s][j]);
            }
            if (max == 0) {
                System.out.println(-1);
                return;
            }
            s += max;
        }
        System.out.println(total-1);
    }
    public static void main(String[] args) throws Exception {
        new Codeup4040().solution();
    }
}
