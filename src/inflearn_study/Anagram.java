package inflearn_study;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    // me
    public static void main(String[] args) {
        Anagram T = new Anagram();
        Scanner kb = new Scanner(System.in);
        String s1 = kb.nextLine();
        String s2 = kb.nextLine();
        System.out.println(T.solution(s1, s2));
    }

    public String solution(String s1, String s2) {
        String answer = "YES";
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char x : s1.toCharArray()) {
            map1.put(x, map1.getOrDefault(x, 0) + 1);
        }
        for (char x : s2.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }
        for (char key : map1.keySet()) {
            if (map1.get(key) != map2.getOrDefault(key, 0)) {
                answer = "NO";
                break;
            }
        }

        return answer;
    }

    // lecture
//    public static void main(String[] args) {
//        Anagram T = new Anagram();
//        Scanner kb = new Scanner(System.in);
//        String s1 = kb.nextLine();
//        String s2 = kb.nextLine();
//        System.out.println(T.solution(s1, s2));
//    }
//
//    public String solution(String s1, String s2) {
//        String answer = "YES";
//        HashMap<Character, Integer> map1 = new HashMap<>();
//        for (char x : s1.toCharArray()) {
//            map1.put(x, map1.getOrDefault(x, 0) + 1);
//        }
//        for (char x : s2.toCharArray()) {
//            if (!map1.containsKey(x) || map1.get(x) == 0) return "NO";
//            map1.put(x, map1.get(x) - 1);
//        }
//
//        return answer;
//    }
}
