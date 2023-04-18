package Baekjun.Algorithms_Basic.자료구조3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java06_ROT13 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            int num = (int)c;
            if(Character.isLowerCase(c)) {
                if(num + 13 > 122) {
                    num = 97 + (num + 13 - 123);
                } else {
                    num = num + 13;
                }
                sb.append((char)num);
            } else if (Character.isUpperCase(c)) {
                if(num + 13 > 90) {
                    num = 65 + (num+13 - 91);
                } else {
                    num = num + 13;
                }
                sb.append((char)num);
            } else {
                sb.append(c);
            }
        }

        System.out.println(sb);
    }
}
