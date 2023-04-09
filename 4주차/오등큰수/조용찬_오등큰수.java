package Baekjun.Algorithms_Basic.자료구조2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

public class java05_오등큰수_2 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        StringTokenizer sn = new StringTokenizer(bf.readLine(), (" "));
        int[] arr = new int[N];
        int[] result = new int[N];

        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(sn.nextToken());
        }

        HashMap<Integer, Integer> hs = new HashMap<>();

        for (Integer i : arr) {
            if (hs.containsKey(i)) {
                hs.put(i, hs.get(i) + 1);
            } else {
                hs.put(i, 1);
            }
        }

        Stack<Integer> st = new Stack<>();

        for(int i : arr) {
            int num = arr[i];
            if(!st.isEmpty()) {
                while (hs.get(arr[st.peek()]) < hs.get(arr[i])) {
                    result[st.pop()] = num;
                }
            }
            st.push(i);
        }

        System.out.println(st);

        while (!st.isEmpty()) {
            result[st.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();

        for (int j : result) {
            sb.append(j).append(" ");
        }

        System.out.println(sb);

    }
}
