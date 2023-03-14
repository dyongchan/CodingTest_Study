package Baekjun.Baekjun_브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java04_체스판다시칠하기 {

    public static boolean[][] arr;
    public static int min = 64; // 8 x 8 의 최대의 경우의 수
    // 최솟값을 구하기 위해 가장 큰 값 설정

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(bf.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        arr = new boolean[M][N];

        for (int i = 0; i < M; i++) {
            String str = bf.readLine();

            for(int j=0; j < N; j++) {
                if(str.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }

        int M_all_row = M - 7; // 경우의 수가 1이다 M-8 할 시 경우의 수가 사라짐
        int N_all_col = N - 7;

        for(int i=0; i<M_all_row; i++) {
            for(int j=0; j<N_all_col; j++) {
                find(i,j);
            }
        }
        System.out.print(min);
    }
    public static void find(int m, int n) {
        int end_m = m + 8;
        int end_n = n + 8;
        int cnt = 0;

        boolean TF = arr[m][n]; // 첫 번째 칸의 색상

        for(int i=m; i<end_m; i++){
            for(int j=n; j<end_n; j++) {
                if(arr[i][j] != TF) { // 색이 다르면 cnt++
                    cnt++;
                }
                TF = (!TF); // 색상의 변경
            }
            TF = !TF; // 교차되어야 하므로 색상을 다시 변경
        }
        cnt = Math.min(cnt, 64-cnt);

        min = Math.min(min, cnt);

    }
}
