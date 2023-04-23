package Baekjun.Algorithms_Basic.수학1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
(n m) = nCm = n! / (n-m)! * m!
2와 5의 각 승수로 변환하여 계산 후, 2와 5중 최솟값의 승수 표현
 */
public class java08_조합0의개수 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        long N = Integer.parseInt(st.nextToken());
        long M = Integer.parseInt(st.nextToken());

        long result_2 = count_2(N) - count_2(N - M) - count_2(M);
        long result_5 = count_5(N) - count_5(N - M) - count_5(M);

        System.out.println(Math.abs(Math.min(result_2, result_5)));
    }
    public static int count_2(long n) {
        int cnt = 0;

        while (n >= 2) {
            cnt = (int)(cnt + (n/2));
            n = n / 2;
        }
        return cnt;
    }
    public static int count_5(long m) {
        int cnt = 0;
            while (m >= 5) {
                cnt = (int)(cnt +(m /5));
                m = m / 5;
        }
        return cnt;
    }
}
