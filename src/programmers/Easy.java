package programmers;

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
}
