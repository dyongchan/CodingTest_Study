package Baekjun.Algorithms_Basic.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java05_소수구하기 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine()," ");

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] arr = new boolean[1000001];

        arr[0] = true;
        arr[1] = true;

        for(int i=2; i<Math.sqrt(arr.length); i++) {
            for(int j= i*i; j<arr.length; j=j+i) {
                arr[j] = true;
            }
        }

        for(int i=M; i<=N; i++) {
            if(!arr[i]) {
                System.out.println(i);
            }
        }

    }
}
