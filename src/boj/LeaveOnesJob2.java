package boj;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeaveOnesJob2 {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int totalDay = Integer.parseInt(br.readLine());
		
		int[][] dayNpay = new int[totalDay][2];
//		int[][] pmt = new int[totalDay][];
		ArrayList<Integer> pmt = new ArrayList<>();
		
		for (int i = 0; i < totalDay; i++) {
			String[] readTemp = br.readLine().split(" ");
			
			dayNpay[i][0] = Integer.parseInt(readTemp[0]);
			dayNpay[i][1] = Integer.parseInt(readTemp[1]);
		}
		
		
		
//		int sumDayCnt = 0;
////		int idx = 0;
//		int tmpSumDayCnt = 0;
//		int tmpPmtCnt = 0;
//		for (int i = 0; i < totalDay; i++) {
//			int idx = 0;
//			while (sumDayCnt <= totalDay) {
//				tmpSumDayCnt += dayNpay[idx][0];
//				if (tmpSumDayCnt <= totalDay) {
//					sumDayCnt = tmpSumDayCnt;
//					tmpPmtCnt += dayNpay[idx][1];
//				}
//			}
//			pmt.add(tmpPmtCnt);
//		}
//		System.out.println(Collections.max(pmt));

	}
}
