package inflearn_study;

import java.util.Scanner;

public class RockPaperScissors {
    // me
    public static void main(String[] args) {
        RockPaperScissors T = new RockPaperScissors();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = kb.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = kb.nextInt();
        }

        for (String s : T.solution(n, arr1, arr2)) {
            System.out.println(s);
        }
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            if ((arr1[i] - arr2[i] == 1) || (arr1[i] - arr2[i] == -2)) {
                answer[i] = "A";
            } else if (arr1[i] - arr2[i] == 0) {
                answer[i] = "D";
            } else {
                answer[i] = "B";
            }
        }

        return answer;
    }
    // lecture
//    public static void main(String[] args) {
//        RockPaperScissors T = new RockPaperScissors();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int[] arr1 = new int[n];
//        int[] arr2 = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr1[i] = kb.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            arr2[i] = kb.nextInt();
//        }
//
//        for (char s : T.solution(n, arr1, arr2).toCharArray()) {
//            System.out.println(s);
//        }
//    }
//
//    public String solution(int n, int[] arr1, int[] arr2) {
//        String answer = "";
//        for (int i = 0; i < n; i++) {
//            if (arr1[i] == arr2[i]) answer += "D";
//            else if (arr1[i] == 1 && arr2[i] == 3) answer += "A";
//            else if (arr1[i] == 2 && arr2[i] == 1) answer += "A";
//            else if (arr1[i] == 3 && arr2[i] == 2) answer += "A";
//            else answer += "B";
//        }
//
//        return answer;
//    }
}
