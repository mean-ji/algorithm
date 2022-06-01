package boj;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class GroupWordChecker {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int wordCount = Integer.parseInt(br.readLine());
		int result = 0;
		
		for (int i = 0 ; i < wordCount; i++) {
			ArrayList<String> groupAlphabet = new ArrayList<String>();
			String word = br.readLine();
			for (int j = 0; j < word.length() - 1 ; j++) {
				if (j == 0) {
					groupAlphabet.add(word.substring(j,j+1));
				}
				if (!word.substring(j, j+1).contentEquals(word.substring(j+1, j+2))) {
					groupAlphabet.add(word.substring(j+1,j+2));
				}
			}
			if (word.length() == 0) {
				groupAlphabet.add(word.substring(0,1));
			}
			
			Collections.sort(groupAlphabet);
			HashSet <String> temp = new HashSet<String>(groupAlphabet);
			ArrayList<String> resultGroup = new ArrayList<String>(temp);
			if(groupAlphabet.size() == resultGroup.size()) result++;
		}
		System.out.println(result);
	}
}
