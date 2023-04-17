package Baekjun.Algorithms_Basic.자료구조3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java04_알파벳찾기 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();
        int[] result = new int[26];

        for(int i=0; i<result.length; i++) {
            result[i] = -1;
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++) {
            int c = Character.getNumericValue(str.charAt(i))-10;
            if(result[c] == -1) {
                result[c] = i;
            }
        }

        for(int i=0; i< result.length; i++) {
            sb.append(result[i]).append(" ");
        }

        System.out.println(sb);
    }
}
