package Baekjun.Algorithms_basic.자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java02_단어뒤집기 {

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<N; i++) {
            String str = bf.readLine();
            String[] arr = str.split(" ");

            for(int j=0; j<arr.length; j++) {
                if (j == arr.length -1) {
                    StringBuffer sf = new StringBuffer(arr[j]);
                    sf.reverse();
                    String factor = sf.toString();

                    sb.append(factor).append(" ").append('\n');
                } else {
                    StringBuffer sf = new StringBuffer(arr[j]);
                    sf.reverse();
                    String factor = sf.toString();

                    sb.append(factor).append(" ");
                }
            }
        }
        System.out.print(sb);
    }
}
