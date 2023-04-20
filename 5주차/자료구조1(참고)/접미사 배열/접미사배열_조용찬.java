package Baekjun.Algorithms_Basic.자료구조3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class java08_접미사배열 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();
        ArrayList<String> arr = new ArrayList<>();

        for(int i=0; i<str.length(); i++) {
            arr.add(str.substring(i));
        }

        Collections.sort(arr);

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<arr.size(); i++) {
            sb.append(arr.get(i)).append('\n');
        }

        System.out.println(sb);
    }
}
