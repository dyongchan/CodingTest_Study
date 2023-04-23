package Baekjun.Algorithms_Basic.수학1_연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
2 - 10 - 8 로 갈 시, 시간초과발생
3자리씩 끊어서 10진수로 변경해주면 8진수가 된다.
 */
public class java03_진수변환2_8 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        String insert = bf.readLine();
        
        if(insert.length() % 3 == 1) {
            System.out.print(insert.charAt(0)-'0');
        } else if (insert.length() % 3 == 2) {
            System.out.print((insert.charAt(0)-'0') * 2 + insert.charAt(1)-'0');
        }
        for (int i=insert.length() % 3; i<insert.length(); i=i+3) {
            System.out.print((insert.charAt(i)-'0')*4 + (insert.charAt(i+1)-'0')*2 + (insert.charAt(i+2)-'0'));
        }

    }
}
/*
기존 풀이 : 2 - 10 - 8  = 시간초과
        String two = bf.readLine();

        int ten = Integer.parseInt(two,2);

        System.out.println(Integer.toOctalString(ten));

str.charAt(0)-'0' = 0번째 문자의 아스키 코드값 - 0의 아스키코드값 (48) = 10진수로 표현된 수
8진수로의 변형 : 첫 번째 = * 4 / 두 번째 = * 2 / 첫 번째 = * 1
3자리씩 끊어서 계산해야하므로 첫번째 3자리의 길이를 확인한다.
 */
