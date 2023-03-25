package Baekjun.Algorithms_Basic.자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class java03_괄호 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++) {
            sb.append(result(bf.readLine())).append('\n');
        }

        System.out.print(sb);
    }

    public static String result(String str) {

        Stack<Character> st = new Stack<>();

        for(int i=0; i<str.length(); i++) {

            if(str.charAt(i) == '(') {
                st.push(str.charAt(i));

            } else if (str.charAt(i)==')' && st.empty()) {
                // ) 가 왔을때 stack이 비어있다 = ) 개수가 많다 OR 처음에 온다.
                return "NO";

            } else {
                st.pop();
            }
        }

        if (st.empty()) { // 비어있다 = 모든 VPS가 완성되었다.
            return "YES";
        } else { // 비어있지 않다 = 남는 ( 가 한 개 이상 존재한다.
            return "NO";
        }
    }
}
