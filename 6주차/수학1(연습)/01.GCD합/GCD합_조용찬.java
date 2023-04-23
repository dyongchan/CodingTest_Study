package Baekjun.Algorithms_Basic.수학1_연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class java01_GCD합 {
    public static void main(String args[])throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int test_case = Integer.parseInt(bf.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<test_case; i++) {
            st = new StringTokenizer(bf.readLine()," ");
            int test_n = Integer.parseInt(st.nextToken());
            long sum = 0; // int 타입 시 테스트 케이스 불만족
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j=0; j<test_n; j++) {
                arr.add(Integer.parseInt(st.nextToken()));
            }

            for(int k=0; k<arr.size(); k++) {
                for(int s=k+1; s<arr.size(); s++) {
                    sum = sum + GCD(arr.get(k), arr.get(s));
                }
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }

    private static int GCD(int n, int m) {
        if (m == 0) {
            return n;
        }
        return GCD(m, n % m);
    }
}
