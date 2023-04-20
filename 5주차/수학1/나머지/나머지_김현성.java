package 백준;

import java.io.*;

public class 백준_나머지_10430번_2번째풀이 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		int num1 = Integer.parseInt(str[0]);
		int num2 = Integer.parseInt(str[1]);
		int num3 = Integer.parseInt(str[2]);

		System.out.println((num1 + num2) % num3);
		System.out.println(((num1 % num3) + (num2 % num3)) % num3);
		System.out.println((num1 * num2) % num3);
		System.out.println(((num1 % num3) * (num2 % num3)) % num3);
	}

}
