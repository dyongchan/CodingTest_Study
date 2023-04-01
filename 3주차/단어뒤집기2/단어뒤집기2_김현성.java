package 백준;

import java.util.*;

public class 백준_단어뒤집기2_17413번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		StringBuilder sb = new StringBuilder();

		boolean braket = false; // 입력받는 문자열중에서 괄호가 시작되는지 판단하기 위해 만든 변수

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			// 괄호가 시작 되는지에 따라서 문자열을 뒤집을지 안뒤집을지 결정되기때문에
			// 조건문으로 괄호 여부를 판단한다.
			if (str.charAt(i) == '<') {
				braket = true;
			} else if (str.charAt(i) == '>') {
				braket = false;
				sb.append(str.charAt(i));

			}
			// 괄호 안에 들어있는 문자들은 순서 그대로 출력 되기에 그대로
			// 괄호 밖에 있는 문자들은 순서가 바뀌어서 출력되기에 스택이라는 자료구조를 이용하여 출력해준다(후입 선출)
			if (braket == true) {// 괄호 안
				sb.append(str.charAt(i));
			} else if (braket == false) {// 괄호 밖
				if (str.charAt(i) == ' ') {// 괄호 밖 문자 경우에 띄어쓰기를 기준으로 문자가 뒤집어서 출력되기에
					while (!stack.isEmpty()) {// 띄어쓰기 전까지 스택에 쌓여있는 문자들을 거꾸로해서sb에 담는다.
						sb.append(stack.pop());
					}
					sb.append(' ');

				} else {// 띄어쓰기가 나오기 전까지는 스택이라는 자료구조를 이용하여 문자를 뒤집어 준다.
					stack.add(str.charAt(i));
				}
			}
		}
		System.out.println(sb);
	}

}
