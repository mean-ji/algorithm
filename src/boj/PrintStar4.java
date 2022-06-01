package boj;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PrintStar4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = N; i > 0; i--) {
			for(int j = 0; j < N - i; j++) {
				System.out.print(" ");
			}
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
