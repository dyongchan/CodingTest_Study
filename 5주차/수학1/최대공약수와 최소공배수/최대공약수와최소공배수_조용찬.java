package Baekjun.Algorithms_Basic.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java02_최대공약수와최소공배수_유클리드 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine()," ");

        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        int result = GCD(first,second);

        sb.append(result).append('\n');
        sb.append((first * second) / result);

        System.out.println(sb);

    }

    public static int GCD(int f, int s) {
        if (s == 0) {
            return f;
        }
        return GCD(s, f % s);
    }
}
