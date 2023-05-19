package programmers;

import java.util.Scanner;

public class Print {
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
}
