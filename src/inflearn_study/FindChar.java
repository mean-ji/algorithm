package inflearn_study;

import java.util.*;

public class FindChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String findStr = sc.nextLine();

        System.out.println(solution(str, findStr));
    }

    public static int solution(String str, String findStr) {
        int count = 0;

        for (String s : str.toLowerCase().split("")) {
            if (s.equals(findStr.toLowerCase())) {
                count++;
            }
        }

        return count;
    }
}
