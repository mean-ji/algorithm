package boj;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FloorPeopleCount {
	public static void main (String[] args) throws IOException{
		int[][] apt = new int[15][15];
		
		for(int i = 0; i < 15; i++) {
			apt[i][1] = 1;
			apt[0][i] = i;
		}
		
		for(int i = 1; i < 15; i++) {
			for(int j = 2; j < 15; j++) {
				apt[i][j] = apt[i][j-1] + apt[i-1][j];
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCount; i++) {
			int result = 0; 
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			for (int j = 1; j <= n; j++) {
				result += apt[k-1][j];
			}
			System.out.println(result);
		}
	} 
}
