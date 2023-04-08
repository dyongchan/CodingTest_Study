package Baekjun.Algorithms_Basic.자료구조2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class java03_오큰수_2 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        StringTokenizer sn = new StringTokenizer(bf.readLine()," ");

        Integer[] arr = new Integer[N];
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(sn.nextToken());
        }

        Stack<Integer> st = new Stack<>();

        for (int i=0; i<arr.length; i++) {
            int num = arr[i];
            if(!st.isEmpty()) {
                while (true) {
                    if(arr[i] > arr[st.peek()]){
                        arr[st.peek()] = num;
                        st.pop();
                    } else {
                        st.push(i);
                        break;
                    }
                    if(st.isEmpty()){
                        st.push(i);
                        break;
                    }
                }
            } else {
                st.push(i);
            }
            if(i == arr.length-1) {
                arr[i] = -1;
                while (!st.isEmpty()) {
                    arr[st.peek()] = -1;
                    st.pop();
                }
            }
        }
        for(int i : arr) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}
