package Baekjun.Algorithms_Basic.자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class java06_큐 {

    public static ArrayList<Integer> queue = new ArrayList<>();

    public static void push(int insert) {
        queue.add(insert);
    }
    public static Integer pop() {
        if(queue.isEmpty()) {
            return -1;
        } else {
            int result = queue.get(0);
            queue.remove(0);
            return result;
        }
    }
    public static Integer size() {
        return queue.size();
    }
    public static Integer empty() {
        if(queue.isEmpty()) {
            return 1;
        } else
            return 0;
    }
    public static Integer front() {
        if(queue.isEmpty()) {
            return  -1;
        } else {
            return queue.get(0);
        }
    }
    public static Integer back() {
        if(queue.isEmpty()) {
            return  -1;
        } else {
            return queue.get(queue.size()-1);
        }
    }

    public static void main(String args[]) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(bf.readLine()," ");
            switch (st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    sb.append(pop()).append('\n');
                    break;
                case "size" :
                    sb.append(size()).append('\n');
                    break;
                case "empty" :
                    sb.append(empty()).append('\n');
                    break;
                case "front" :
                    sb.append(front()).append('\n');
                    break;
                case "back" :
                    sb.append(back()).append('\n');
                    break;
            }
        }
        System.out.print(sb);
    }
}
