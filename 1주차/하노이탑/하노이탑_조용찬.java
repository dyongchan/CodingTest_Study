package Baekjun.Baekjun_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 하노이의 탑 공식 / 원판 = n개 / A B C
 A에 있던 가장 큰 원판을 제외한 나머지 원판 (n-1)개 가 B로 이동하기 위해 반복됨 Hanoi(n-1)
 A에 있던 가장 큰 원판이 C로 이동한다. (1회)
 B에 있던 나머지 원판(n-1)개가 C로 이동하기 위해 반복됨 Hanoi(n-1)

 총 이동 횟수 : 2 * Hanoi(n-1) + 1
 점화식 (a_n 은 이동횟수) : a_n = 2 * a_(n-1) + 1

 정리
 1) 양쪽 항에 1씩 더해준다. a_(n+1) + 1 = 2 * a_(n) + 2
 2) 항을 묶어준다. a_(n+1) + 1 = 2(a_(n)+1)
 3) a_n + 1 = b_n으로 치환해주면 b_(n+1) = 2(b_n +1) / 공비는 2
 4) 첫 번째 수열의 항이 a_1 = 1 이므로 b_1 = 2
 5) 따라서 첫 항이 2, 공비가 2인 등비수열이 된다.
 b_n = a_n + 1 = 2^n
 a_n = 2^n - 1

 */

public class java06_하노이의탑 {

    public static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        sb.append((int)Math.pow(2,N) -1).append('\n');

        Hanoi(N,1,2,3);

        System.out.println(sb);
    }
    public static void Hanoi(int N, int first, int second, int third) {
        if (N == 1) {
            sb.append(first+" "+third).append('\n');
            return;
        }
        Hanoi(N-1,first,third,second);

        sb.append(first+" "+third).append('\n');

        Hanoi(N-1,second,first,third);
    }
}
