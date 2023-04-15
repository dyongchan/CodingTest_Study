package 백준;

import java.io.*;

public class 백준_문자열분석_10820번 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int arr[] = new int[4];
		
		
		while((str = br.readLine()) == null) {
			for(int i=0; i<str.length(); i++) {
				char c = str.charAt(i);
				if(c >= 'a' &&c <='z') {
					arr[0]++;
				}else if(c>='A'&&c<='Z') {
					arr[1]++;
				}else if(c>='0'&&c<='9') {
					arr[2]++;
				}else if(c==' ') {
					arr[3]++;
				}
			}
		}
		for(int j=0; j<4; j++) {
			System.out.print(arr[j]+" ");
		}
 
	}

}
