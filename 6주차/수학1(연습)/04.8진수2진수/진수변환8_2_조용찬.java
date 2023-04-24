package Baekjun.Algorithms_Basic.수학1_연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java04_진수변환8_2 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String insert = bf.readLine();

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<insert.length(); i++) {
            String alter = Integer.toBinaryString(insert.charAt(i)-'0');

            if(i != 0 && alter.length() == 1) {
                sb.append("00").append(alter);
            } else if (i != 0 && alter.length() == 2) {
                sb.append('0').append(alter);
            } else {
                sb.append(alter);
            }
        }
        System.out.println(sb);
    }
}
