package Baekjun.Algorithms_Basic.자료구조3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class java01_후위표기식2 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        char[] arr = bf.readLine().toCharArray();

        HashMap<Character,Double> hs = new HashMap<>();

        char key ='A';
        for(int i=0; i<N; i++) {
            hs.put(key,Double.parseDouble(bf.readLine()));
            key++;
        }

        Stack<Double> st = new Stack<>();

        for (char c : arr) {
            if ('A' <= c && c <= 'Z') {
                st.push(hs.get(c));
            } else {
                if (!st.isEmpty()) {
                    Double local_1 = st.pop();
                    Double local_2 = st.pop();

                    switch (c) {
                        case '*':
                            st.push(local_1 * local_2);
                            break;
                        case '+':
                            st.push(local_1 + local_2);
                            break;
                        case '-':
                            st.push(local_2 - local_1);
                            break;
                        case '/':
                            st.push(local_2 / local_1);
                            break;
                    }
                }
            }
        }
        System.out.printf("%.2f%n", st.pop());
    }
}
