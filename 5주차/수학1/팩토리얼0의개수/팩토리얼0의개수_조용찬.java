package Baekjun.Algorithms_Basic.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java07_팩토리얼0의개수 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        int count_5 = 0;

        for (int i = 1; i <=N; i++) {
            int compare = i;
            
            while(compare % 5 == 0) {
                count_5++;
                compare = compare / 5;
            }
        }
        System.out.println(count_5);
    }
}
