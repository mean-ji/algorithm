package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Easy {
    public void printA(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(a);
    }

    public void printAAndB(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subs(int num1, int num2) {
        int answer = 0;
        boolean val = (-50000 <= num1 && 50000 >= num1) && (-50000 <= num2 && 50000 >= num2);
        if (val) {
            return num1 - num2;
        }
        return answer;
    }

    public int mult(int num1, int num2) {
        return num1 * num2;
    }

    public int mod(int num1, int num2) {
        int answer = 0;
        boolean val = (0 < num1 && 100 >= num1) && (0 < num2 && 100 >= num2);

        if (val) {
            return num1 / num2;
        }

        return answer;
    }

    public int div(int num1, int num2) {
        int answer = 0;
        boolean val = (0 < num1 && 100 >= num1) && (0 < num2 && 100 >= num2);

        if (val) {
            double num1Double = num1;
            double num2Double = num2;
            double result = (num1Double / num2Double) * 1000;

            answer = (int) Math.floor(result);
        }

        return answer;
    }

    public int compare(int num1, int num2) {
        int answer = 0;

        boolean val = (0 <= num1 && 10000 >= num1) && (0 <= num2 && 10000 >= num2);

        if (val) {
            return num1 == num2 ? 1 : -1;
        }

        return answer;
    }

    public int div2(int num1, int num2) {
        int answer = -1;
        boolean val = (0 < num1 && 100 >= num1) && (0 < num2 && 100 >= num2);

        if (val) {
            return num1 % num2;
        }

        return answer;
    }

    public static void printForLoop(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }
    }

    public static void printEvenOdd(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isOdd = n % 2 == 1;

        System.out.println(n + " is " + (isOdd ? "odd" : "even"));
    }

    public static void main(String[] args) {
        Easy e = new Easy();
        e.substring("hahahahahahahahha", "youretoslow", 4);
    }

    public String substring(String my_string, String overwrite_string, int s) {
        String answer = "";
        if (s + overwrite_string.length() < my_string.length()) {
            answer = my_string.substring(0, s) + overwrite_string + my_string.substring(overwrite_string.length() + s);
        } else {
            answer = my_string.substring(0, s) + overwrite_string;
        }
        System.out.println(answer);
        return answer;
    }

    public void printAPlusB(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public void printSpecialString() {
        System.out.println("!@#$%^&*(\\\'\"<>?:;");
    }

    public String mix(String str1, String str2) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            answer.append(str1.charAt(i)).append(str2.charAt(i));
        }
        return answer.toString();
    }

    public static void println(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
        }
    }

    public static void attach(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(a + b);
    }

    public String join(String[] arr) {
        String answer = "";
        answer = String.join("", arr);
        return answer;
    }

    public static void changeUpperLower(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (int i = 0; i < a.length(); i++) {
            System.out.print(
                    Character.isUpperCase(a.charAt(i)) ? String.valueOf(a.charAt(i)).toLowerCase() : String.valueOf(a.charAt(i)).toUpperCase()
            );
        }
    }

    public String stringMult(String my_string, int k) {
        String answer = "";

        for (int i = 0; i < k; i++) {
            answer += my_string;
        }

        return answer;
    }

    public int findMax(int a, int b) {
        int answer = 0;
        String str1 = a + String.valueOf(b);
        String str2 = b + String.valueOf(a);

        return Math.max(Integer.parseInt(str1), Integer.parseInt(str2));
    }
}
