package Baekjun.Algorithms_Basic.수학1_연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java05_진수변환_마이너스2 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        double N = Double.parseDouble(bf.readLine());
        StringBuilder sb = new StringBuilder();

        if (N == 0) {
            sb.append(0);
        } else  {
            while (N != 1.0) {
                sb.append((int)Math.abs(N % (-2)));
                N = Math.ceil(N / -2);
            }
            sb.append(1);
        }

        sb.reverse();
        System.out.println(sb);

    }
}
