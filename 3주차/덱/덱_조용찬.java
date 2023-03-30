package Baekjun.Algorithms_Basic.자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class java08_덱 {

    public static ArrayList<Integer> front = new ArrayList<>();
    public static ArrayList<Integer> back = new ArrayList<>();

    public static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(bf.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(bf.readLine(), " ");

            if (st.countTokens() > 1) {
                switch (st.nextToken()) {
                    case "push_front": { push_front(Integer.parseInt(st.nextToken())); }
                    break;
                    case "push_back": {push_back(Integer.parseInt(st.nextToken()));}
                    break;
                }
            } else {
                switch (st.nextToken()) {
                    case "pop_front": {
                        pop_front();
                        break;
                    }
                    case "pop_back": {
                        pop_back();
                        break;
                    }
                    case "size": {
                        sb.append(size()).append('\n');
                        break;
                    }
                    case "empty": {
                        sb.append(empty()).append('\n');
                        break;
                    }
                    case "front": {
                        sb.append(front()).append('\n');
                        break;
                    }
                    case "back": {
                        sb.append(back()).append('\n');
                    }
                }
            }
        }
        System.out.println(sb);
    }

    public static void push_front(Integer x) {
        front.add(x);
    }

    public static void push_back(Integer x) {
        back.add(x);
    }

    public static void pop_front() {
        if (front.isEmpty() && back.isEmpty()) {
            sb.append(-1).append('\n');
        } else if (front.isEmpty() && !back.isEmpty()) {
            sb.append(back.get(0)).append('\n');
            back.remove(0);
        } else {
            sb.append(front.get(front.size()-1)).append('\n');
            front.remove(front.size()-1);
        }
    }

    public static void pop_back() {
        if (front.isEmpty() && back.isEmpty()) {
            sb.append(-1).append('\n');
        } else if (back.isEmpty() && !front.isEmpty()) {
            sb.append(front.get(0)).append('\n');
            front.remove(0);
        } else {
            sb.append(back.get(back.size()-1)).append('\n');
            back.remove(back.size()-1);
        }
    }

    public static int size() {
        return front.size() + back.size();
    }

    public static int empty() {
        if(front.isEmpty() && back.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }
    public static int front() {
        if (front.isEmpty() && back.isEmpty()) {
            return -1;
        } else if (front.isEmpty() && !back.isEmpty()) {
            return back.get(0);
        } else {
            return front.get(front.size()-1);
        }
    }

    public static int back() {
        if (front.isEmpty() && back.isEmpty()) {
            return -1;
        } else if (back.isEmpty() && !front.isEmpty()) {
            return front.get(0);
        } else {
            return back.get(back.size()-1);
        }
    }
}
