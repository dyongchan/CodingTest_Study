package Baekjun.Algorithms_Basic.자료구조2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class java02_쇠막대기 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();
        int result = 0;

        Stack<Character> st = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '(' && str.charAt(i+1) == ')') {
                result = result + st.size();
                i++;
                continue;
            }
            if(str.charAt(i) == '(') {
                st.push(str.charAt(i));
            } else if (!st.empty() && str.charAt(i) == ')'){
                st.pop();
                result = result + 1;
            }
        }
        System.out.println(result);
    }
}
