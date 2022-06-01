package boj;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class RobotCleaner {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[N][M];
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		int r = Integer.parseInt(st1.nextToken());
		int c = Integer.parseInt(st1.nextToken());
		int d = Integer.parseInt(st1.nextToken());
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st2.nextToken());
			}
		}
		
		int cleanCnt = 0;
		while(true) {
			if (map[r][c] == 0) {
				map[r][c] = 1;
				cleanCnt++;
			}
			
			// 3 -> map[r][c-1]
			// 2 -> map[r+1][c]
			// 1 -> map[r][c+1]
			// 0 -> map[r-1][c]
			
			if (d-1 == -1) {
				d = 3;
			} else {
				d = d - 1;
			}
			
			int[]isClean = new int[4];
			isClean[0] = map[r-1][c];
			isClean[1] = map[r][c+1];
			isClean[2] = map[r+1][c];
			isClean[3] = map[r][c-1];
			
//			switch (d) {
//				case 0: isClean = map[r-1][c]; break;
//				case 1: isClean = map[r][c+1]; break;
//				case 2: isClean = map[r+1][c]; break;
//				case 3: isClean = map[r][c-1]; break;
//				default: break;
//			}
			
			if (isClean[0] == 1 ) {
				//a
			}
			
			
			
			
		}
		
	}

}
