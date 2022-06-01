package boj;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallLocomotive {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int train = Integer.parseInt(br.readLine());
		int[] pas = new int[train + 1];
		// 승객 합
		int[] sum = new int[train + 1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int idx = 1;
		while (st.hasMoreTokens()) {
			pas[idx] = Integer.parseInt(st.nextToken());
			sum[idx] = sum[idx - 1] + pas[idx];
			idx++;
		}
		
		int cover = Integer.parseInt(br.readLine());
		int[][] dp = new int[4][train + 1];
		
		/**
		 * 소형 기관차 한 대일 때 승객 태울 수 있는 합을 계산해서 dp[1]에 저장합니다.
		 * 소형 기관차 두 대일 때 승객 태울 수 있는 합을 계산해서 dp[2]에 저장합니다.
		 * 이 때 (1, 2) (2, 3) 이런식으로 끌고 갈 수 없기 때문에 dp[i -1][j - cover]와 sum을 합치면 됩니다.
		 * 이 문제 예시에서는 1, 2 다음에 3, 4 부분 계산하는 식으로 진행합니다.
		 * 최대 승객 수를 구하는 것이기 때문에 dp[i][j - 1]이 구해놓은 것보다 크면 그걸로 대체합니다.
		 * dp[i][train + 1]은 한 대, 두 대, 세 대 일 때 가장 많은 승객 수 입니다.
		 *  */
		
		for (int i = 1; i < 4; i++) {
			for (int j = i * cover; j <= train; j++) {
				dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j - cover] + (sum[j] - sum[j - cover]));
			}
		}
		
		
		System.out.println(dp[3][train]);
		

	}

}
