package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 7568번 - 브루트포스
 * N개의 줄에 각 사람의 몸무게와 키를 나타내는 양의 정수 x,y를 비교하여 등수를 구한다.
 * 1. N^2만큼 for 자신보다 큰 덩치 체크 bulk[i]++
 * 2. bulk[i] + 1을 공백있게 프린트
 */
public class Bulk {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[][] bulks = new int[n][2];
        int[] ranks = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            bulks[i][0] = Integer.parseInt(st1.nextToken());
            bulks[i][1] = Integer.parseInt(st1.nextToken());
        }

        for (int i = 0; i < n; i++) {
            int bulkWeight = bulks[i][0];
            int bulkHeight = bulks[i][1];
            int rank = 0;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    int anotherWeight = bulks[j][0];
                    int anotherHeight = bulks[j][1];
                    if (bulkWeight < anotherWeight && bulkHeight < anotherHeight) {
                        rank++;
                    }
                }
            }
            ranks[i] = rank;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ranks[i] + 1);
            if (i != n-1) {
                System.out.print(" ");
            }
        }
    }
}
