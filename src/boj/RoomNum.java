package boj;
import java.util.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RoomNum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		N = N.replaceAll("9", "6");
		String[] inputNumArr = N.split("");
		List<Integer> set = new ArrayList<>();
		
		for (String i : inputNumArr) {
			set.add(Integer.parseInt(i));
		}
		
		Collections.sort(set);
		int[] res = new int[10];
		
		for (int i = 0; i < set.size(); i++) {
			int temp = set.get(i);
			res[temp]++;
		}
		if (res[6] % 2 == 0) res[6] /= 2;
		else res[6] = res[6] / 2 + 1;
		
		
		for (int i = 0; i < 9; i++) {
			int temp = res[i];
			if(temp > res[i+1]) {
				res[i] = res[i+1];
				res[i+1] = temp;
			}
		}
		
		int rs = 0;
		rs = res[9];
		
		System.out.println(rs);
	}

}
