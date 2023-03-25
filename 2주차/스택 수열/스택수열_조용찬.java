package Baekjun.Algorithms_Basic.자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 스택의 원리를 이용한다. (LIFO) = 가장 위가 나 자신
// 가장 높은수가 나왔을 때 부터 내림차순으로 입력되어야 정상적인 출력이 가능하다.

public class java04_스택수열 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(bf.readLine());

        Stack<Integer> st = new Stack<>();

        int compare = 0;

        for(int i=0; i<N; i++) {
            int T = Integer.parseInt(bf.readLine());

            if(T > compare) {
                for(int j=compare+1; j<=T; j++) {
                    st.push(j);
                    sb.append("+").append('\n');
                    compare = T;
                }
            } else if(T != st.peek()) {
                System.out.println("NO");
                return;
            }

            st.pop();
            sb.append("-").append('\n');
        }
        System.out.println(sb);
    }
}
