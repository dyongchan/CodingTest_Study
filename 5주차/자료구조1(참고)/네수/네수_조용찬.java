package Baekjun.Algorithms_Basic.자료구조3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java07_네수  {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = bf.readLine().split(" ");

        Long res_1 = Long.parseLong(arr[0]+arr[1]);
        Long res_2 = Long.parseLong(arr[2]+arr[3]);

        System.out.println(res_1+res_2);

    }
}
