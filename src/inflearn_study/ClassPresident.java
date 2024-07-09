package inflearn_study;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class ClassPresident {
    // me
    public static void main(String[] args) {
        ClassPresident T = new ClassPresident();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n, str));
    }

    public String solution(int n, String str) {
        String answer = "";
        HashMap<String, Integer> hash = new HashMap<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int tmp = hash.get(String.valueOf(str.charAt(i))) != null ? hash.get(String.valueOf(str.charAt(i))) : 0;
            hash.put(String.valueOf(str.charAt(i)), tmp + 1);
        }
        Set<String> keySet = hash.keySet();
        for (String key: keySet) {
            if (hash.get(key) > max) {
                max = hash.get(key);
                answer = key;
            }
        }
        return answer;
    }
    // lecture
//    public static void main(String[] args) {
//        ClassPresident T = new ClassPresident();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        String str = kb.next();
//        System.out.println(T.solution(n, str));
//    }
//
//    public char solution(int n, String str) {
//        char answer = ' ';
//        int max = Integer.MIN_VALUE;
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (char x : str.toCharArray()) {
//            map.put(x, map.getOrDefault(x, 0) + 1);
//        }
//        for (char x : map.keySet()) {
//            if (map.get(x) > max) {
//                max = map.get(x);
//                answer = x;
//            }
//        }
//
//        return answer;
//    }
}
