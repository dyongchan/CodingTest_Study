package 백준;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준_접미사배열_11656번 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=0; i<str.length(); i++) {
			list.add(str.substring(i, str.length()));
		}
		Collections.sort(list);
		for(String k : list) {
			System.out.println(k);
		}
//		for(String k : st) {
//			System.out.println(k);
//		}// 출력이 가장 아래부터 되네? 
		
		
	}

}
