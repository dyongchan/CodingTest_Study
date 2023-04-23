package Baekjun.Algorithms_Basic.수학1_연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java02_숨바꼭질6 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        st = new StringTokenizer(bf.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine()," ");

        StringBuilder sb = new StringBuilder();

        if(st.countTokens() == 1) {
            sb.append(Math.abs(Integer.parseInt(st.nextToken()))-S);
        } else {
            Integer[] arr = new Integer[N];
            for(int i=0; i<N; i++) {
                arr[i] = Math.abs(Integer.parseInt(st.nextToken()) - S);
            }
            sb.append(var_GCD(arr));
        }
        System.out.println(sb);
    }

    public static int GCD(int n, int m){
        if(m == 0) {
            return n;
        }
        return GCD(m, n % m );
    }

// 여러개의 숫자의 최대 공약수 구하기 = 정수들이 들어있는 배열을 인자로 넣으며 재귀함수로 구하기

    public static int var_GCD(Integer[] arr) {
        if(arr.length == 1) {
            return arr[0];
        }

        int gcd = GCD(arr[0],arr[1]);

        for(int i=2; i<arr.length; i++) {
            gcd = GCD(gcd, arr[i]);
        }
        return  gcd;
    }
}
