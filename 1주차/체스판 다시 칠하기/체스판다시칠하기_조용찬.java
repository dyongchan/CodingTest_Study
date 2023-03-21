package Baekjun.Baekjun_브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java04_체스판다시칠하기_재작성 {
    public static boolean[][] arr;
    public static int min = 64; // 최대 64개의 차이를 설정

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new boolean[N][M];

        for(int i=0; i<N; i++) {
            String str = bf.readLine();

            for(int j=0; j<M; j++) {
                if(str.charAt(j) == 'W') { // W = false, B = true
                    arr[i][j] = false;
                } else {
                    arr[i][j] = true;
                }
            }
        }

        int n_w = N - 7; // for(int i=0; i<n_w).. 8 X 8의 조건이므로 -8 까지의 값만 봐도 다 확인 가능하다.
        int n_b = M - 7;

        for(int i=0; i<n_w; i++) {
            for(int j=0; j<n_b; j++) {
                check(i,j);
            }
        }
        System.out.print(min);
    }
    public static int check(int n,int m) {

        int max_n = n + 8;
        int max_m = m + 8;

        int cnt = 0;

        boolean compare = arr[n][m]; // 시작점

        for(int i =n; i<max_n; i++) {
            for(int j=m; j<max_m; j++) {
                if (arr[i][j] != compare) {
                    cnt++;
                }
                compare = !compare; // 색을 바꿔가며 확인
            }
            compare = !compare; // 초기값과 아래 행의 초기값은 달라야 해서 변경
        }

        cnt = Math.min(cnt, 64-cnt);

        min = Math.min(cnt, min); // 함수를 계속 돌며 가장 작은 값을 덮어씌워줌

        return min;
    }
}
