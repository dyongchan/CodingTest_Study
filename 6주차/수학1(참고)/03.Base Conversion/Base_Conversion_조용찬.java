package Baekjun.Algorithms_Basic.수학1_참고;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class java03_Base_Conversion {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(bf.readLine()," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(bf.readLine());

        st = new StringTokenizer(bf.readLine()," ");

        int ten = 0;

        for (int i=m-1; i>=0; i--) {
            ten = (int) (ten + (Integer.parseInt(st.nextToken()) * Math.pow(A, i)));
        }

        ArrayList<Integer> arr = new ArrayList<>();

        // 진법 변환 : n진법으로 변환 시, n으로 해당 수를 나눈 나머지가 가장 큰 차수부터 내려오게됨

        while (ten != 0) {
            arr.add(ten % B);
            ten /= B;
        }

        StringBuilder sb = new StringBuilder();

        for (int i=arr.size()-1; i>=0; i--) {
            sb.append(arr.get(i)).append(" ");
        }

        System.out.println(sb);
    }
}
