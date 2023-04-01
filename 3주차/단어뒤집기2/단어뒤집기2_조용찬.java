package Baekjun.Algorithms_Basic.자료구조2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class java01_단어뒤집기2 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();

        StringBuilder sb = new StringBuilder();

        Stack<Character> st = new Stack<>();

        boolean clamp = false;

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '<') {
                if(!st.empty()){
                    while (!st.empty()) {
                        sb.append(st.pop());
                    }
                }
                clamp = true;

            } else if (str.charAt(i) == '>') {
                sb.append(str.charAt(i));
                clamp = false;
                continue; // 해당 조건은 건너뛴다.
            }

            if(clamp) {
                sb.append(str.charAt(i));
            } else {
                if(str.charAt(i) == ' ') {
                    while (!st.empty()) {
                        sb.append(st.pop());
                    }
                    sb.append(' ');
                } else {
                    st.push(str.charAt(i));
                }
            }

            if(i == str.length()-1) {
                while (!st.empty()) {
                    sb.append(st.pop());
                }
            }

        }
        System.out.println(sb);
    }
}
