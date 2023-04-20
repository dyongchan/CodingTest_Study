package 백준;

import java.util.Scanner;

public class 백준_소수찾기_1978번 {

	public static boolean sosoo(int num) { // 소수면 true , 소수가 아니면 false 
		if(num < 2) {
			return false;
		}else {
			for(int i=2; i*i<=num; i++) {
				if(num % i == 0) { // 소수로 나누어서 떨어진다는 말은 약수로 나누었을때 소수를 갖는다는 말 
					return false;
				}
			}
			return true;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int num = sc.nextInt();
			if(sosoo(num)) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
