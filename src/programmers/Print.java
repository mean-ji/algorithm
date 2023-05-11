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
}
