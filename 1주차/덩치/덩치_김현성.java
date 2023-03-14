package 백준_12단계_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준_12단계_덩치 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		int arr[][] = new int[T][2];

		String wei_hei[]; // 입력받는것을 스캐너를 안쓰고 버퍼를 사용했기때문에 string타입으로 받는다. 
		for (int i = 0; i < T; i++) {
			wei_hei = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(wei_hei[0]); // 몸무게
			arr[i][1] = Integer.parseInt(wei_hei[1]); // 키
		}
		for (int j = 0; j < T; j++) {
			int rank = 1;

			for (int k = 0; k < T; k++) {
				if(j==k) continue; // 자기 자신과 비교하는경우를 넘어가기 위하여 
				else if(arr[j][0]<arr[k][0]&&arr[j][1]<arr[k][1]) {
					rank++;
				}
			}
			System.out.println(rank);
		}
	}
}
