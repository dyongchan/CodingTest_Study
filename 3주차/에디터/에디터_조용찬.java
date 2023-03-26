package Baekjun.Algorithms_Basic.자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class java05_에디터 {

    public static Stack<String> st1 = new Stack<>(); // 커서의 이동을 위한 스택
    public static Stack<String> st2 = new Stack<>(); // 출력 스택


    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String[] arr = bf.readLine().split("");

        for (String s : arr) {
            st1.push(s);
        }

        int N = Integer.parseInt(bf.readLine());

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(bf.readLine()," ");

            if(st.countTokens() == 1) {
                switch (st.nextToken()) {
                    case "L" :
                        if(!st1.empty()){
                            L();
                        }
                        break;
                    case "D" :
                        if(!st2.empty()){
                            D();
                        }
                        break;
                    case "B" :
                        if(!st1.empty()){
                            B();
                        }
                        break;
                }
            }
            else {
                if(st.nextToken().equals("P")) {
                    P(st.nextToken());
                }
            }
        }

        while (!st1.empty()) {
            st2.push(st1.pop());
        }

        while (!st2.empty()) {
            sb.append(st2.pop());
        }

        System.out.println(sb);
    }

    public static void L() {
        st2.push(st1.pop());
    }
    public static void D() {
        st1.push(st2.pop());
    }
    public static void B() {
        st1.pop();
    }
    public static void P(String str) {
        st1.push(str);
    }

}
