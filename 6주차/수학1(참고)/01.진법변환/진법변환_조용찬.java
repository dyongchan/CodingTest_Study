package Baekjun.Algorithms_Basic.수학1_참고;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java02_진법변환 {
        public static void main(String args[]) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(bf.readLine()," ");

            String N = st.nextToken();
            int B = Integer.parseInt(st.nextToken());

            int result = Integer.parseInt(N,B);

            System.out.println(result);

        }
}
