package inflearn_study;

import java.util.HashMap;
import java.util.Scanner;

public class FindAllAnagram {
    // me
//    public static void main(String[] args) {
//        FindAllAnagram T = new FindAllAnagram();
//        Scanner kb = new Scanner(System.in);
//        String s = kb.nextLine();
//        String t = kb.nextLine();
//        System.out.println(T.solution(s, t));
//    }
//    public int solution(String s, String t) {
//        int answer = 0, lt = 0;
//        HashMap<Character, Integer> map1 = new HashMap<>();
//        HashMap<Character, Integer> map2 = new HashMap<>();
//        for (char x : t.toCharArray()) {
//            map1.put(x, map1.getOrDefault(x, 0) + 1);
//        }
//        for (int i = 0; i < t.length() - 1; i++) {
//            map2.put(s.charAt(i), map2.getOrDefault(s.charAt(i), 0) + 1);
//        }
//        for(int rt = t.length() - 1; rt < s.length(); rt++) {
//            map2.put(s.charAt(rt), map2.getOrDefault(s.charAt(rt), 0) + 1);
//            if (map1.size() == map2.size()) {
//                int cnt = 0;
//                for (char key : map1.keySet()) {
//                    if (map2.getOrDefault(key, 0) == map1.get(key)) cnt++;
//                    else break;
//                }
//                if (cnt == map1.size()) answer++;
//            }
//            map2.put(s.charAt(lt), map2.get(s.charAt(lt)) - 1);
//            if (map2.get(s.charAt(lt)) == 0) map2.remove(s.charAt(lt));
//            lt++;
//        }
//
//        return answer;
//    }

    // lecture
    public static void main(String[] args) {
        FindAllAnagram T = new FindAllAnagram();
        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();
        String t = kb.nextLine();
        System.out.println(T.solution(s, t));
    }
    public int solution(String a, String b) {
        int answer = 0, lt = 0;
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();
        for (char x : b.toCharArray()) {
            bm.put(x, bm.getOrDefault(x, 0) + 1);
        }
        for (int i = 0; i < b.length() - 1; i++) {
            am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
        }
        for (int rt = b.length() - 1; rt < a.length(); rt++) {
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);
            if (am.equals(bm)) answer++;
            am.put(a.charAt(lt), am.get(a.charAt(lt)) - 1);
            if (am.get(a.charAt(lt)) == 0) am.remove(a.charAt(lt));
            lt++;
        }

        return answer;
    }
}
