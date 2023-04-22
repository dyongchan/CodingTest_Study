package Baekjun.Algorithms_Basic.수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java06_골드바흐의추측 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        boolean[] arr = new boolean[1000001];

        arr[0] = true;
        arr[1] = true;

        for(int i=2; i<Math.sqrt(arr.length); i++) {
            for(int j= i*i; j<arr.length; j=i+j){
                arr[j] = true;
            }
        }

        int insert;
        StringBuilder sb = new StringBuilder();
        boolean Compare = false;
        while ( (insert = Integer.parseInt(bf.readLine())) != 0) {

            for (int i=1; i<insert/2+1; i=i+2) {
                if(!arr[i] && !arr[insert-i]) {
                    sb.append(insert).append(" = ").append(i).append(" + ").append(insert-i).append('\n');
                    Compare = true;
                    break;
                    }
                }
            if(!Compare) {
                sb.append("Goldbach's conjecture is wrong").append('\n');
            }
        }
        System.out.println(sb);
    }
}
