package Baekjun.Algorithms_Basic.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java04_소수찾기 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");

        int result = 0;

        for(int i=0; i<N; i++) {
           int num = Integer.parseInt(st.nextToken());
           int cnt = 0;
           for(int j=1; j<=num; j++) {
               if(num % j == 0) {
                   cnt++;
               }
           }
           if (cnt == 2) {
               result++;
           }
        }
        System.out.println(result);
    }
}
