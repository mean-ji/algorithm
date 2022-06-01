package boj;
import java.util.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// 2810
public class CupHolder {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int pCnt = Integer.parseInt(br.readLine());
		String seat = br.readLine();
		
		int lCnt = 0;
		int sCnt = 0;
		
		String[] seatArray = seat.split("");
		for (int i = 0; i < pCnt; i++) {
			if (seatArray[i].equals("L")) lCnt++;
			if (seatArray[i].equals("S")) sCnt++;
		}
		
		int result = (lCnt / 2) + 1 + sCnt;
		
		if (result > pCnt) result = pCnt;
		
		System.out.println(result);
	}

}
