package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준_ROT13_11655번 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)== ' ') {
				sb.append(' ');
			}
			else {
				char ch = (char)(str.charAt(i)+13);	
				sb.append(ch);
			}
		}
		System.out.println(sb);
	}

}
