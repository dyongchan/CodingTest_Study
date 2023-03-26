package Baekjun.Algorithms_Basic.자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class java07_요세푸스문제 {

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =  new StringTokenizer(bf.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int local_num = Integer.parseInt(st.nextToken())-1;

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=1; i<=N; i++) {
            arr.add(i);
        }
        int re_num = local_num;

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (arr.size() != 0) {
            if(re_num < arr.size()) {
                if(arr.size() == 1) {
                    sb.append(arr.get(re_num)).append(">");
                } else {
                    sb.append(arr.get(re_num)).append(", ");
                }
                arr.remove(re_num);
                re_num = re_num + local_num;
            } else {
                re_num = re_num - arr.size();
            }
        }
        System.out.println(sb);
    }
}
