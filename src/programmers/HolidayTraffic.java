package programmers;

import java.text.SimpleDateFormat;
import java.util.*;

public class HolidayTraffic {
    public int solution(String[] lines) throws Exception {
        int answer = 0;
        return countTraffic(lines);
    }

    public int countTraffic(String[] lines) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss.SSS");

        int[] count = new int[lines.length];
        int max = 0;
        for (int i = 0; i < lines.length; i++) {
            String[] line = lines[i].split(" ");
            Date currentLineDate = format.parse(line[1]);
            long currentEnd = currentLineDate.getTime();

            for (int j = i; j < lines.length; j++) {
                String[] nextLine = lines[j].split(" ");
                Date nextLineDate = format.parse(nextLine[1]);
                double sec = Double.parseDouble(nextLine[2].substring(0, nextLine[2].length() - 1));

                long nextStart = (long) (nextLineDate.getTime() - sec * 1000 + 1);

                if (currentEnd + 1000 > nextStart) {
                    count[i] += 1;
                    max = Math.max(max, count[i]);
                }
            }
        }
        return max;
    }
}
