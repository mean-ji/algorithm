package boj;
import java.util.*;

public class Microwave {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int A = 300;
		int B = 60;
		int C = 10;
		
		int aCnt = 0;
		int bCnt = 0;
		int cCnt = 0;
		
		
		if (T >= A) {
			aCnt = T / A;
			T %= A;
		}
		
		if (T >= B) {
			bCnt = T / B;
			T %= B;
		}
		
		if (T >= C) {
			cCnt = T / C;
			T %= C;
		}
		
		if (T != 0) System.out.println("-1");
		else System.out.println(aCnt + " " + bCnt + " " + cCnt);
	}

}
