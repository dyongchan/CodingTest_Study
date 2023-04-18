package Baekjun.Algorithms_Basic.자료구조3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java05_문자열분석 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = "";

        while ((str = bf.readLine()) != null) {
            int lower = 0;
            int upper = 0;
            int Int = 0;
            int gap = 0;

            for(int i=0; i<str.length(); i++) {
                char c = str.charAt(i);
                if('a' <= c && c<= 'z') {
                    lower++;
                } else if ('A' <= c && c<= 'Z') {
                    upper++;
                } else if ('0' <= c && c<= '9') {
                    Int++;
                } else {
                    gap++;
                }
            }
            sb.append(lower+ " " +upper+ " " +Int+ " " +gap+'\n');
        }
        System.out.println(sb);
    }
}
