package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroupWordChecker_1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int wordCount = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < wordCount; i++) {
            String curWord = br.readLine();
            if (isGroupWord(curWord)) {
                answer += 1;
            }
        }

        System.out.println(answer);
    }

    public static boolean isGroupWord(String curWord) {

        String usedWordGroup = curWord.substring(0, 1);

        for (int i = 1; i < curWord.length(); i++) {
            String curString = curWord.substring(i, i+1);
            if (usedWordGroup.contains(curWord.substring(i, i+1))
                    && !curString.equals(usedWordGroup.substring(usedWordGroup.length() - 1))) {
                return false;
            } else {
                usedWordGroup += curWord.substring(i, i+1);
            }
        }
        return true;
    }
}
