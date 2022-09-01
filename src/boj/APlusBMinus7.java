package boj;

import java.io.*;

public class APlusBMinus7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseT = Integer.parseInt(br.readLine());

        for (int i = 1; i <= caseT; i++) {
            String line = br.readLine();
            int left = Integer.parseInt(line.split(" ")[0]);
            int right = Integer.parseInt(line.split(" ")[1]);;
            int total = left + right;

            bw.write("Case #" + i + ": " + total);
            bw.newLine();
        }

        br.close();
        bw.flush(); // 남아있는 데이터 출력
        bw.close();
    }
}
