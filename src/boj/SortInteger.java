package boj;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortInteger {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		
		list.forEach((l) -> {
			System.out.println(l);
		});
		
	}

}
