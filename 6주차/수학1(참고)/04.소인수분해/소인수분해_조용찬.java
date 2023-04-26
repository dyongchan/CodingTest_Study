package Baekjun.Algorithms_Basic.수학1_참고;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java04_소인수분해 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        StringBuilder sb = new StringBuilder();
        int i = 2;

        if (N == 1) {
            System.out.println(sb);
        } else {
            while (true) {
                if (N % i == 0) {
                    N /= i;
                    sb.append(i).append('\n');
                } else {
                    i++;
                }

                if(N == 1) {
                    break;
                }
            }
            System.out.println(sb);
        }

    }
}
