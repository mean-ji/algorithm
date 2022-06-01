package boj;
import java.util.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// 2720번
public class Laundry {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			int qCnt = 0;
			int dCnt = 0;
			int nCnt = 0;
			int pCnt = 0;
			
			if (N >= 25) {
				qCnt = N / 25;
				N %= 25;
			}
			
			if (N >= 10) {
				dCnt = N / 10;
				N %= 10;
			}
			
			if (N >= 5) {
				nCnt = N / 5;
				N %= 5;
			}
			
			if (N >= 1) {
				pCnt = N / 1;
				N %= 1;
			}
			
			System.out.println(qCnt + " " + dCnt + " " + nCnt + " " + pCnt + " ");
		}

	}

}
