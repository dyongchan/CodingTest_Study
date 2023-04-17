package Baekjun.Algorithms_Basic.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java03_최소공배수_유클리드 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<N; i++) {
            st = new StringTokenizer(bf.readLine()," ");
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            int result = GCD(first,second);

            sb.append((first * second) / result).append('\n');

        }
        System.out.println(sb);
    }

    public static int GCD(int f, int s) {
        if (s == 0) {
            return f;
        }
        return GCD(s, f % s);
    }
}
