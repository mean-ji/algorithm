package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 1065번. 한수 개수 출력
 * N보다 작은 수 중에 각 자리가 등차수열을 이루는 숫자의 개수 구하기
 * 1. 1부터 N까지 for
 * 2. 한수인지 아닌지 판별하는 함수 만들기
 *      2-1. (n자리 숫자) - (n-1자리 숫자) 가 모두 같을 때 answer++
 */
public class HanSu {
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            checkHansu(i);
        }

        System.out.println(answer);
    }

    public static void checkHansu(int n) {
        String nStr = String.valueOf(n);
        int diff = 0;

        if (nStr.length() == 1 || nStr.length() == 2) {
            answer++;
            return;
        }

        diff = Integer.parseInt(nStr.substring(1, 2)) - Integer.parseInt(nStr.substring(0, 1));

        for (int i = 2; i < nStr.length(); i++) {
            int ndiff = Integer.parseInt(nStr.substring(i, i+1)) - Integer.parseInt(nStr.substring(i-1, i));
            if (ndiff != diff) {
                return;
            }
        }
        answer++;
    }
}
