package Baekjun.Baekjun_브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java03_덩치 {

    public static void main(String args[]) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st;

        int[][] arr = new int[N][2];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(bf.readLine()," ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++) {
            int cnt = 0;

            for(int j=0; j<N; j++) {
                if(arr[j][0] > arr[i][0] && arr[j][1] > arr[i][1]) {
                    cnt++;
                }
            }
            sb.append(cnt+1).append(' ');
        }
        System.out.print(sb);
        bf.close();
    }
}
