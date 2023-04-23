package Baekjun.Algorithms_Basic.수학1_연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java06_골드바흐파티션{
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int test_case = Integer.parseInt(bf.readLine());

        boolean[] arr = new boolean[1000001];
        arr[0] = true;
        arr[1] = true;

        for(int i=2; i<Math.sqrt(arr.length); i++) {
            for(int j=i*i; j<arr.length; j=i+j) {
                arr[j] = true;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<test_case; i++) {
            int result = 0;
            int N = Integer.parseInt(bf.readLine());

            for(int j=1; j<=N/2; j++) // 1 ~ 입력한 수의 절반 = 겹치지 않게 더할 수 있음
                if (!arr[j] && !arr[N - j]) {
                    result++;
                }
            sb.append(result).append('\n');
        }
        System.out.println(sb);
    }
}
